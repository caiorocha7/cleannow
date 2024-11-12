package com.cleannow.cleannow.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dataColeta;
    private Date dataEntrega;

    public Agendamento() {}

    public Agendamento(Date dataColeta, Date dataEntrega) {
        this.dataColeta = dataColeta;
        this.dataEntrega = dataEntrega;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataColeta() {
        return dataColeta;
    }

    public void setDataColeta(Date dataColeta) {
        this.dataColeta = dataColeta;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
}
