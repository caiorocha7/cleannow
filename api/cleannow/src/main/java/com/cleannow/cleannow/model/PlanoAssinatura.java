package com.cleannow.cleannow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PlanoAssinatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomePlano;
    private double valorMensal;

    public PlanoAssinatura() {}

    public PlanoAssinatura(String nomePlano, double valorMensal) {
        this.nomePlano = nomePlano;
        this.valorMensal = valorMensal;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }
}
