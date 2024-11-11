// src/Agendamento/Agendamento.java
package Agendamento;

import java.util.Date;

public class Agendamento {
    private Date dataColeta;
    private Date dataEntrega;

    public Agendamento(Date dataColeta, Date dataEntrega) {
        this.dataColeta = dataColeta;
        this.dataEntrega = dataEntrega;
    }

    public Date getDataColeta() {
        return dataColeta;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataColeta(Date dataColeta) {
        this.dataColeta = dataColeta;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
}
