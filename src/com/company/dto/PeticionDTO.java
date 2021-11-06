package com.company.dto;
import com.company.models.Sucursal;

import java.util.Date;

public class PeticionDTO {
    private String obraSocial;
    private Date fechaCarga;
    private Date fechaEntrega;
    private boolean finalizada;
    private Sucursal sucursal;

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public String getObraSocial() {
        return obraSocial;
    }
    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }
    public Date getFechaCarga() {
        return fechaCarga;
    }
    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }
    public Date getFechaEntrega() {
        return fechaEntrega;
    }
    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    public boolean isFinalizada() {
        return finalizada;
    }
    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public PeticionDTO(String obraSocial, Date fechaCarga, Date fechaEntrega, boolean finalizada, Sucursal sucursal) {
        this.obraSocial = obraSocial;
        this.fechaCarga = fechaCarga;
        this.fechaEntrega = fechaEntrega;
        this.finalizada = finalizada;
        this.sucursal = sucursal;
    }
}
