package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class Practica {
    private int codigoPractica;
    private String nombrePractica;
    private int cantHorasResultado;
    private RangoValores valoresCriticos;
    private RangoValores valoresReservados;
    private List<Practica> practicas = new ArrayList<>();

    public int getCodigoPractica() {
        return codigoPractica;
    }

    public String getNombrePractica() {
        return nombrePractica;
    }

    public int getCantHorasResultado() {
        return cantHorasResultado;
    }

    public RangoValores getValoresCriticos() {
        return valoresCriticos;
    }

    public RangoValores getValoresReservados() {
        return valoresReservados;
    }

    public void setCodigoPractica(int codigoPractica) {
        this.codigoPractica = codigoPractica;
    }

    public void setNombrePractica(String nombrePractica) {
        this.nombrePractica = nombrePractica;
    }

    public void setCantHorasResultado(int cantHorasResultado) {
        this.cantHorasResultado = cantHorasResultado;
    }

    public void setValoresCriticos(RangoValores valoresCriticos) {
        this.valoresCriticos = valoresCriticos;
    }

    public void setValoresReservados(RangoValores valoresReservados) {
        this.valoresReservados = valoresReservados;
    }

    public Practica(int codigoPractica, String nombrePractica, int cantHorasResultado, RangoValores valoresCriticos, RangoValores valoresReservados) {
        this.codigoPractica = codigoPractica;
        this.nombrePractica = nombrePractica;
        this.cantHorasResultado = cantHorasResultado;
        this.valoresCriticos = valoresCriticos;
        this.valoresReservados = valoresReservados;
    }
}
