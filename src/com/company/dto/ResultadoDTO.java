package com.company.dto;

import com.company.models.Practica;

public class ResultadoDTO {
    private Practica practica;
    private int valor;

    public Practica getPractica() {
        return practica;
    }

    public void setPractica(Practica practica) {
        this.practica = practica;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ResultadoDTO(Practica practica, int valor) {
        this.practica = practica;
        this.valor = valor;
    }
}
