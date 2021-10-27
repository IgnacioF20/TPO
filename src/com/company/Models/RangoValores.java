package com.company.Models;

public class RangoValores {
    private int valorMinimo;
    private int valorMaximo;

    public int getValorMinimo() {
        return valorMinimo;
    }

    public int getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMinimo(int valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public void setValorMaximo(int valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public RangoValores(int valorMinimo, int valorMaximo) {
        this.valorMinimo = valorMinimo;
        this.valorMaximo = valorMaximo;
    }
}
