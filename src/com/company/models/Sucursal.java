package com.company.models;

import com.company.dto.SucursalDTO;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {

    List<Peticion> peticiones;
    int numero;
    String dirección;
    Usuario responsableTecnico;

    //  CONSTRUCTOR from dto
    public Sucursal(SucursalDTO dto) {

        peticiones = new ArrayList<>();

        this.numero = dto.getNumero();
        this.dirección = dto.getDirección();
        this.responsableTecnico = dto.getResponsableTecnico();
    }

    //  FUNCTIONS
    public boolean esResponsable(int dni) {
        return dni == responsableTecnico.dni;
    }


    public void enlazarPeticion(Peticion peticion) {
        peticiones.add(peticion);
    }


    public SucursalDTO toDTO(){
        SucursalDTO dto = new SucursalDTO(this);
        return dto;
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

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public void setResponsableTecnico(Usuario responsableTecnico) {
        this.responsableTecnico = responsableTecnico;
    }
}