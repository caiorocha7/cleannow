// src/Cliente/ClienteVIP.java
package Cliente;

import PlanoAssinatura.PlanoAssinatura;

public class ClienteVIP extends Cliente {
    private PlanoAssinatura planoAssinatura;
    private double desconto;

    public ClienteVIP(String nome, String contato, PlanoAssinatura planoAssinatura, double desconto) {
        super(nome, contato, "VIP");
        this.planoAssinatura = planoAssinatura;
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public PlanoAssinatura getPlanoAssinatura() {
        return planoAssinatura;
    }

    public void setPlanoAssinatura(PlanoAssinatura planoAssinatura) {
        this.planoAssinatura = planoAssinatura;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
