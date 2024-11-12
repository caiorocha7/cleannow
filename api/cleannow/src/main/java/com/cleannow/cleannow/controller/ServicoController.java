package com.cleannow.cleannow.controller;

import com.cleannow.cleannow.model.Servico;
import com.cleannow.cleannow.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@RequestMapping("/servicos")
@Tag(name = "Servicos", description = "API for managing services")
public class ServicoController {

    @Autowired
    private ServicoRepository servicoRepository;

    @GetMapping
    @Operation(summary = "List all services")
    public List<Servico> listarServicos() {
        return servicoRepository.findAll();
    }

    @PostMapping
    @Operation(summary = "Add a new service")
    public Servico adicionarServico(@RequestBody Servico servico) {
        return servicoRepository.save(servico);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update a service")
    public Servico atualizarServico(@PathVariable Long id, @RequestBody Servico servicoAtualizado) {
        Servico servico = servicoRepository.findById(id).orElseThrow();
        servico.setTipoServico(servicoAtualizado.getTipoServico());
        servico.setPreco(servicoAtualizado.getPreco());
        return servicoRepository.save(servico);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a service")
    public void deletarServico(@PathVariable Long id) {
        servicoRepository.deleteById(id);
    }
}
