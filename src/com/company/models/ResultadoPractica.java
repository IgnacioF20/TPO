package com.company.models;

public class ResultadoPractica {
    private Practica practica;
    private int valor;

    public Practica getPractica() {
        return practica;
    }

    public int getValor() {
        return valor;
    }

    public void setPractica(Practica practica) {
        this.practica = practica;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ResultadoPractica(Practica practica, int valor) {
        this.practica = practica;
        this.valor = valor;
    }


}
