package Main;

import Agendamento.Agendamento;
import Cliente.Cliente;
import Cliente.ClienteVIP;
import Pedido.Pedido;
import PlanoAssinatura.PlanoAssinatura;
import Servico.Servico;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João Silva", "123456789", "Normal");
        PlanoAssinatura planoVIP = new PlanoAssinatura("Gold", 99.99);
        ClienteVIP clienteVIP = new ClienteVIP("Maria Oliveira", "987654321", planoVIP, 0.10);

        Servico lavagem = new Servico("Lavagem", 20.0);
        Pedido pedido1 = new Pedido(1, lavagem);
        cliente.adicionarPedido(pedido1);

        Agendamento agendamento = new Agendamento(new Date(), new Date());

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Pedido Status: " + pedido1.getStatus());
    }
}
