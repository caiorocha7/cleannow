package com.cleannow.cleannow.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Servico servico;
    private String status;
    private Date dataCriacao;

    @ManyToOne
    private Cliente cliente;

    public Pedido() {
        this.dataCriacao = new Date();
        this.status = "Pendente";
    }

    public Pedido(Servico servico, Cliente cliente) {
        this.servico = servico;
        this.cliente = cliente;
        this.dataCriacao = new Date();
        this.status = "Pendente";
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
