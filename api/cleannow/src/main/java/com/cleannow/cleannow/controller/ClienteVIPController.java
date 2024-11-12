package com.cleannow.cleannow.controller;

import com.cleannow.cleannow.model.ClienteVIP;
import com.cleannow.cleannow.repository.ClienteVIPRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes-vip")
@Tag(name = "Clientes VIP", description = "API for managing VIP customers")
public class ClienteVIPController {

    @Autowired
    private ClienteVIPRepository clienteVIPRepository;

    @GetMapping
    @Operation(summary = "List all VIP customers")
    public List<ClienteVIP> listarClientesVIP() {
        return clienteVIPRepository.findAll();
    }

    @PostMapping
    @Operation(summary = "Add a new VIP customer")
    public ClienteVIP adicionarClienteVIP(@RequestBody ClienteVIP clienteVIP) {
        return clienteVIPRepository.save(clienteVIP);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update a VIP customer")
    public ClienteVIP atualizarClienteVIP(@PathVariable Long id, @RequestBody ClienteVIP clienteAtualizado) {
        ClienteVIP clienteVIP = clienteVIPRepository.findById(id).orElseThrow();
        clienteVIP.setNome(clienteAtualizado.getNome());
        clienteVIP.setContato(clienteAtualizado.getContato());
        clienteVIP.setPlanoAssinatura(clienteAtualizado.getPlanoAssinatura());
        clienteVIP.setDesconto(clienteAtualizado.getDesconto());
        return clienteVIPRepository.save(clienteVIP);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a VIP customer")
    public void deletarClienteVIP(@PathVariable Long id) {
        clienteVIPRepository.deleteById(id);
    }
}
