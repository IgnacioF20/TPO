package com.company.Models;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private int numero;
    private String dirección;
    private Usuario responsableTecnico;
    private List<Peticion> peticiones = new ArrayList<>();

    public int getNumero() {
        return numero;
    }

    public String getDirección() {
        return dirección;
    }

    public Usuario getResponsableTecnico() {
        return responsableTecnico;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public void setResponsableTecnico(Usuario responsableTecnico) {
        this.responsableTecnico = responsableTecnico;
    }

    public Sucursal(int numero, String dirección, Usuario responsableTecnico) {
        this.numero = numero;
        this.dirección = dirección;
        this.responsableTecnico = responsableTecnico;
    }
}
