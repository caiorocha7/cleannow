package com.cleannow.cleannow.model;

import jakarta.persistence.Entity;

@Entity
public class ClienteVIP extends Cliente {
    private String planoAssinatura;
    private double desconto;

    public ClienteVIP() {}

    public ClienteVIP(String nome, String contato, String planoAssinatura, double desconto) {
        super(nome, contato, "VIP");
        this.planoAssinatura = planoAssinatura;
        this.desconto = desconto;
    }

    public String getPlanoAssinatura() {
        return planoAssinatura;
    }

    public void setPlanoAssinatura(String planoAssinatura) {
        this.planoAssinatura = planoAssinatura;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
