// src/PlanoAssinatura/PlanoAssinatura.java
package PlanoAssinatura;

public class PlanoAssinatura {
    private String nomePlano;
    private double valorMensal;

    public PlanoAssinatura(String nomePlano, double valorMensal) {
        this.nomePlano = nomePlano;
        this.valorMensal = valorMensal;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }
}
