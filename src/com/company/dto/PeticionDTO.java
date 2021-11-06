package com.company.dto;
import java.util.Date;

public class PeticionDTO {
    private String obraSocial;
    private Date fechaCarga;
    private Date fechaEntrega;
    private boolean finalizada;

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
    public PeticionDTO(String obraSocial, Date fechaCarga, Date fechaEntrega, boolean finalizada) {
        this.obraSocial = obraSocial;
        this.fechaCarga = fechaCarga;
        this.fechaEntrega = fechaEntrega;
        this.finalizada = finalizada;
    }
}
