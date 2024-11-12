package com.cleannow.cleannow.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String contato;
    private String tipoCliente;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Pedido> historicoPedidos = new ArrayList<>();

    public Cliente() {}

    public Cliente(String nome, String contato, String tipoCliente) {
        this.nome = nome;
        this.contato = contato;
        this.tipoCliente = tipoCliente;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public List<Pedido> getHistoricoPedidos() {
        return historicoPedidos;
    }

    public void adicionarPedido(Pedido pedido) {
        historicoPedidos.add(pedido);
    }
}
