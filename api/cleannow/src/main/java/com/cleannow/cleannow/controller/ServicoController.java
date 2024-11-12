package com.cleannow.cleannow.controller;

import com.cleannow.cleannow.model.Servico;
import com.cleannow.cleannow.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicos")
public class ServicoController {

    @Autowired
    private ServicoRepository servicoRepository;

    @GetMapping
    public List<Servico> listarServicos() {
        return servicoRepository.findAll();
    }

    @PostMapping
    public Servico adicionarServico(@RequestBody Servico servico) {
        return servicoRepository.save(servico);
    }

    @PutMapping("/{id}")
    public Servico atualizarServico(@PathVariable Long id, @RequestBody Servico servicoAtualizado) {
        Servico servico = servicoRepository.findById(id).orElseThrow();
        servico.setTipoServico(servicoAtualizado.getTipoServico());
        servico.setPreco(servicoAtualizado.getPreco());
        return servicoRepository.save(servico);
    }

    @DeleteMapping("/{id}")
    public void deletarServico(@PathVariable Long id) {
        servicoRepository.deleteById(id);
    }
}
