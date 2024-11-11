// src/Cliente/Cliente.java
package Cliente;

import Pedido.Pedido;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String contato;
    private String tipoCliente;
    private ArrayList<Pedido> historicoPedidos;

    public Cliente(String nome, String contato, String tipoCliente) {
        this.nome = nome;
        this.contato = contato;
        this.tipoCliente = tipoCliente;
        this.historicoPedidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getContato() {
        return contato;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public ArrayList<Pedido> getHistoricoPedidos() {
        return historicoPedidos;
    }

    public void adicionarPedido(Pedido pedido) {
        historicoPedidos.add(pedido);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void setHistoricoPedidos(ArrayList<Pedido> historicoPedidos) {
        this.historicoPedidos = historicoPedidos;
    }
}
