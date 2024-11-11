// src/Pagamento/Pagamento.java
package Pagamento;

public class Pagamento {
    public enum TipoPagamento {
        AVULSO, ASSINATURA
    }

    private TipoPagamento tipoPagamento;
    private double valor;

    public Pagamento(TipoPagamento tipoPagamento, double valor) {
        this.tipoPagamento = tipoPagamento;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
