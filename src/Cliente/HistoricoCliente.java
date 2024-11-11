// src/Cliente/HistoricoCliente.java
package Cliente;

import Pedido.Pedido;
import java.util.ArrayList;
import java.util.List;

public class HistoricoCliente {
    private List<Pedido> pedidos;

    public HistoricoCliente() {
        this.pedidos = new ArrayList<>();
    }

    // Método para adicionar um pedido ao histórico
    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    // Método para obter o histórico de pedidos
    public List<Pedido> getHistoricoPedidos() {
        return new ArrayList<>(pedidos);
    }

    // Método para imprimir o histórico de pedidos
    public void exibirHistorico() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido no histórico.");
        } else {
            for (Pedido pedido : pedidos) {
                System.out.println("ID do Pedido: " + pedido.getIdPedido() + ", Status: " + pedido.getStatus());
            }
        }
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
