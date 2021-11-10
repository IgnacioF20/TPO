package com.company.dto;

import com.company.models.Sucursal;
import com.company.models.Usuario;

public class SucursalDTO {

//    hola

    private int numero;
    private String dirección;
    private Usuario responsableTecnico;

    //  CONSTRUCTOR from args
    public SucursalDTO(int numero, String dirección, Usuario responsableTecnico) {
        this.numero = numero;
        this.dirección = dirección;
        this.responsableTecnico = responsableTecnico;
    }

    //  CONSTRUCTOR from model
    public SucursalDTO(Sucursal sucursal){

        this.numero = sucursal.getNumero();
        this.dirección = sucursal.getDirección();
        this.responsableTecnico = sucursal.getResponsableTecnico();
    }

    //  GETTER AND SETTER

    public int getNumero() {
        return numero;
    }

    public String getDirección() {
        return dirección;
    }

    public Usuario getResponsableTecnico() {
        return responsableTecnico;
    }
}
