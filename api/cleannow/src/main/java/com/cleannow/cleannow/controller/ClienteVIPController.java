package com.cleannow.cleannow.controller;

import com.cleannow.cleannow.model.ClienteVIP;
import com.cleannow.cleannow.repository.ClienteVIPRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes-vip")
public class ClienteVIPController {

    @Autowired
    private ClienteVIPRepository clienteVIPRepository;

    @GetMapping
    public List<ClienteVIP> listarClientesVIP() {
        return clienteVIPRepository.findAll();
    }

    @PostMapping
    public ClienteVIP adicionarClienteVIP(@RequestBody ClienteVIP clienteVIP) {
        return clienteVIPRepository.save(clienteVIP);
    }

    @PutMapping("/{id}")
    public ClienteVIP atualizarClienteVIP(@PathVariable Long id, @RequestBody ClienteVIP clienteAtualizado) {
        ClienteVIP clienteVIP = clienteVIPRepository.findById(id).orElseThrow();
        clienteVIP.setNome(clienteAtualizado.getNome());
        clienteVIP.setContato(clienteAtualizado.getContato());
        clienteVIP.setPlanoAssinatura(clienteAtualizado.getPlanoAssinatura());
        clienteVIP.setDesconto(clienteAtualizado.getDesconto());
        return clienteVIPRepository.save(clienteVIP);
    }

    @DeleteMapping("/{id}")
    public void deletarClienteVIP(@PathVariable Long id) {
        clienteVIPRepository.deleteById(id);
    }
}
