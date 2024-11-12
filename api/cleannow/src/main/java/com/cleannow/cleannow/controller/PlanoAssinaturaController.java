package com.cleannow.cleannow.controller;

import com.cleannow.cleannow.model.PlanoAssinatura;
import com.cleannow.cleannow.repository.PlanoAssinaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planos-assinatura")
public class PlanoAssinaturaController {

    @Autowired
    private PlanoAssinaturaRepository planoAssinaturaRepository;

    @GetMapping
    public List<PlanoAssinatura> listarPlanosAssinatura() {
        return planoAssinaturaRepository.findAll();
    }

    @PostMapping
    public PlanoAssinatura adicionarPlanoAssinatura(@RequestBody PlanoAssinatura planoAssinatura) {
        return planoAssinaturaRepository.save(planoAssinatura);
    }

    @PutMapping("/{id}")
    public PlanoAssinatura atualizarPlanoAssinatura(@PathVariable Long id, @RequestBody PlanoAssinatura planoAtualizado) {
        PlanoAssinatura plano = planoAssinaturaRepository.findById(id).orElseThrow();
        plano.setNomePlano(planoAtualizado.getNomePlano());
        plano.setValorMensal(planoAtualizado.getValorMensal());
        return planoAssinaturaRepository.save(plano);
    }

    @DeleteMapping("/{id}")
    public void deletarPlanoAssinatura(@PathVariable Long id) {
        planoAssinaturaRepository.deleteById(id);
    }
}