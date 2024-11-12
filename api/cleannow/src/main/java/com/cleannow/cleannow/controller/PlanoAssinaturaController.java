package com.cleannow.cleannow.controller;

import com.cleannow.cleannow.model.PlanoAssinatura;
import com.cleannow.cleannow.repository.PlanoAssinaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@RequestMapping("/planos-assinatura")
@Tag(name = "Planos de Assinatura", description = "API for managing subscription plans")
public class PlanoAssinaturaController {

    @Autowired
    private PlanoAssinaturaRepository planoAssinaturaRepository;

    @GetMapping
    @Operation(summary = "List all subscription plans")
    public List<PlanoAssinatura> listarPlanosAssinatura() {
        return planoAssinaturaRepository.findAll();
    }

    @PostMapping
    @Operation(summary = "Add a new subscription plan")
    public PlanoAssinatura adicionarPlanoAssinatura(@RequestBody PlanoAssinatura planoAssinatura) {
        return planoAssinaturaRepository.save(planoAssinatura);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update a subscription plan")
    public PlanoAssinatura atualizarPlanoAssinatura(@PathVariable Long id, @RequestBody PlanoAssinatura planoAtualizado) {
        PlanoAssinatura plano = planoAssinaturaRepository.findById(id).orElseThrow();
        plano.setNomePlano(planoAtualizado.getNomePlano());
        plano.setValorMensal(planoAtualizado.getValorMensal());
        return planoAssinaturaRepository.save(plano);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a subscription plan")
    public void deletarPlanoAssinatura(@PathVariable Long id) {
        planoAssinaturaRepository.deleteById(id);
    }
}