package com.company.dto;

import com.company.models.Sucursal;
import com.company.models.Usuario;

public class SucursalDTO {

    private String numero;
    private String dirección;
    private String responsableTecnico;

    //  CONSTRUCTOR from args
    public SucursalDTO(String numero, String dirección, String responsableTecnico) {
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

    public String getNumero() {
        return numero;
    }

    public String getDirección() {
        return dirección;
    }

    public String getResponsableTecnico() {
        return responsableTecnico;
    }
}
