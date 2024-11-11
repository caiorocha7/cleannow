// src/Pedido/Pedido.java
package Pedido;

import Servico.Servico;
import java.util.Date;

public class Pedido {
    private int idPedido;
    private Servico servico;
    private StatusPedido status;
    private Date dataCriacao;

    public Pedido(int idPedido, Servico servico) {
        this.idPedido = idPedido;
        this.servico = servico;
        this.status = StatusPedido.PENDENTE; // Status inicial
        this.dataCriacao = new Date();
    }

    public void atualizarStatus(StatusPedido novoStatus) {
        this.status = novoStatus;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    // Getters e Setters adicionais, se necessário
}
