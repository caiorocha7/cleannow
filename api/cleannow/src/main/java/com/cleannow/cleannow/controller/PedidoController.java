package com.cleannow.cleannow.controller;

import com.cleannow.cleannow.model.Pedido;
import com.cleannow.cleannow.repository.PedidoRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
@Tag(name = "Pedidos", description = "API for managing orders")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    @Operation(summary = "List all orders")
    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    @PostMapping
    @Operation(summary = "Add a new order")
    public Pedido adicionarPedido(@RequestBody Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an order")
    public Pedido atualizarPedido(@PathVariable Long id, @RequestBody Pedido pedidoAtualizado) {
        Pedido pedido = pedidoRepository.findById(id).orElseThrow();
        pedido.setStatus(pedidoAtualizado.getStatus());
        pedido.setServico(pedidoAtualizado.getServico());
        return pedidoRepository.save(pedido);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete an order")
    public void deletarPedido(@PathVariable Long id) {
        pedidoRepository.deleteById(id);
    }
}
