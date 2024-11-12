package com.cleannow.cleannow.controller;

import com.cleannow.cleannow.model.Agendamento;
import com.cleannow.cleannow.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    @GetMapping
    public List<Agendamento> listarAgendamentos() {
        return agendamentoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Agendamento> adicionarAgendamento(@RequestBody Agendamento agendamento) {
        Agendamento novoAgendamento = agendamentoRepository.save(agendamento);
        return new ResponseEntity<>(novoAgendamento, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Agendamento> atualizarAgendamento(@PathVariable Long id, @RequestBody Agendamento agendamentoAtualizado) {
        Optional<Agendamento> agendamentoExistente = agendamentoRepository.findById(id);
        if (agendamentoExistente.isPresent()) {
            Agendamento agendamento = agendamentoExistente.get();
            agendamento.setDataColeta(agendamentoAtualizado.getDataColeta());
            agendamento.setDataEntrega(agendamentoAtualizado.getDataEntrega());
            return new ResponseEntity<>(agendamentoRepository.save(agendamento), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarAgendamento(@PathVariable Long id) {
        if (agendamentoRepository.existsById(id)) {
            agendamentoRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
