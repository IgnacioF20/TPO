package com.company.dto;
import com.company.models.RangoValores;

public class PracticaDTO {
    private int codigoPractica;
    private String nombrePractica;
    private int cantHorasResultado;
    private boolean usoHabilitado;
    private RangoValores valoresCriticos;
    private RangoValores valoresReservados;

    public int getCodigoPractica() {
        return codigoPractica;
    }

    public void setCodigoPractica(int codigoPractica) {
        this.codigoPractica = codigoPractica;
    }

    public String getNombrePractica() {
        return nombrePractica;
    }

    public void setNombrePractica(String nombrePractica) {
        this.nombrePractica = nombrePractica;
    }

    public int getCantHorasResultado() {
        return cantHorasResultado;
    }

    public void setCantHorasResultado(int cantHorasResultado) {
        this.cantHorasResultado = cantHorasResultado;
    }

    public RangoValores getValoresCriticos() {
        return valoresCriticos;
    }

    public void setValoresCriticos(RangoValores valoresCriticos) {
        this.valoresCriticos = valoresCriticos;
    }

    public RangoValores getValoresReservados() {
        return valoresReservados;
    }

    public void setValoresReservados(RangoValores valoresReservados) {
        this.valoresReservados = valoresReservados;
    }

    public boolean isUsoHabilitado() {
        return usoHabilitado;
    }

    public void setUsoHabilitado(boolean usoHabilitado) {
        this.usoHabilitado = usoHabilitado;
    }

    public PracticaDTO(int codigoPractica, String nombrePractica, int cantHorasResultado, boolean usoHabilitado, RangoValores valoresCriticos, RangoValores valoresReservados) {
        this.codigoPractica = codigoPractica;
        this.nombrePractica = nombrePractica;
        this.cantHorasResultado = cantHorasResultado;
        this.usoHabilitado = usoHabilitado;
        this.valoresCriticos = valoresCriticos;
        this.valoresReservados = valoresReservados;
    }
}
