package com.cleannow.cleannow.controller;

import com.cleannow.cleannow.model.Pedido;
import com.cleannow.cleannow.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    @PostMapping
    public Pedido adicionarPedido(@RequestBody Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    @PutMapping("/{id}")
    public Pedido atualizarPedido(@PathVariable Long id, @RequestBody Pedido pedidoAtualizado) {
        Pedido pedido = pedidoRepository.findById(id).orElseThrow();
        pedido.setStatus(pedidoAtualizado.getStatus());
        pedido.setServico(pedidoAtualizado.getServico());
        return pedidoRepository.save(pedido);
    }

    @DeleteMapping("/{id}")
    public void deletarPedido(@PathVariable Long id) {
        pedidoRepository.deleteById(id);
    }
}
