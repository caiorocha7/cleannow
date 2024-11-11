package Servico;

public class Servico {
    private String tipoServico;
    private double preco;

    public Servico(String tipoServico, double preco) {
        this.tipoServico = tipoServico;
        this.preco = preco;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public double getPreco() {
        return preco;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
