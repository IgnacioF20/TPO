package com.company.models;

import com.company.dto.SucursalDTO;
import java.util.ArrayList;
import java.util.List;

public class Sucursal {

    List<Peticion> peticiones;
    String numero;
    String dirección;
    String responsableTecnico;

    //  CONSTRUCTOR from dto
    public Sucursal(SucursalDTO dto) {

        peticiones = new ArrayList<>();

        this.numero = dto.getNumero();
        this.dirección = dto.getDirección();
        this.responsableTecnico = dto.getResponsableTecnico();
    }

    //  FUNCTIONS
    //public boolean esResponsable(String dni) {return dni == responsableTecnico.dni;}

    public void enlazarPeticion(Peticion peticion) {
        peticiones.add(peticion);
    }


    public boolean tienePeticionesActivas(){

        boolean tienePeticionesActivas = false;

        for (Peticion peticion: peticiones) {
            if (peticion.estaActiva()) {
                tienePeticionesActivas = true;
                break;
            }
        }
        return tienePeticionesActivas;
    }

    public void derivarPeticionesActivas(Sucursal sucursalDestino){

        for (Peticion peticion: peticiones) {

            peticion.setSucursal(sucursalDestino);
            sucursalDestino.addPeticion(peticion);
            this.peticiones.remove(peticion);
        }
    }

    public SucursalDTO toDTO(){
        SucursalDTO dto = new SucursalDTO(this);
        return dto;
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

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public void setResponsableTecnico(String responsableTecnico) {
        this.responsableTecnico = responsableTecnico;
    }

    public void addPeticion(Peticion peticion){

        this.peticiones.add(peticion);
    }
}