package com.company.controllers;

import com.company.dto.SucursalDTO;
import com.company.models.Sucursal;
import java.util.ArrayList;

public class LaboratorioController {

//    hola

    static LaboratorioController instance = null;
    ArrayList<Sucursal> sucursales;

    //  CONSTRUCTOR
    private LaboratorioController(){
        sucursales = new ArrayList();
    }

    // SINGLETON
    public static LaboratorioController getInstance(){
        if(instance == null){
            instance = new LaboratorioController();
        }
        return instance;
    }

    //  FUNCTIONS
    public boolean altaSucursal(SucursalDTO dto){

        Sucursal sucursal = getSucursal(dto.getNumero());

        if(sucursal != null){
            sucursal = new Sucursal(dto);
            this.sucursales.add(sucursal);
        }
        return (sucursal != null);
    }


    public boolean modificarSucursal(SucursalDTO dto){

        Sucursal sucursalAModificar = getSucursal(dto.getNumero());

        if(sucursalAModificar != null){

            sucursalAModificar.setDirección(dto.getDirección());
            sucursalAModificar.setNumero(dto.getNumero());
            sucursalAModificar.setResponsableTecnico(dto.getResponsableTecnico());
        }
        return (sucursalAModificar != null);
    }


    public boolean bajaSucursal(SucursalDTO dto){

        Sucursal sucursalAEliminar = getSucursal(dto.getNumero());

        if(sucursalAEliminar != null){

            if(!sucursalAEliminar.tienePeticionesActivas())

                this.sucursales.remove(sucursalAEliminar);
            else

                sucursalAEliminar = null;
        }
        return (sucursalAEliminar != null);
    }


    public boolean tienePeticionesActivas(int numeroSucursal){

        Sucursal sucursal = getSucursal(numeroSucursal);

        if(sucursal != null){

            return(sucursal.tienePeticionesActivas());
        }
        return false;
    }


    public boolean derivarPeticionesActivas(int numeroSucursalOrigen, int numeroSucursalDestino){

        Sucursal sucursalOrigen = getSucursal(numeroSucursalOrigen);
        Sucursal sucursalDestino = null;

        if(sucursalOrigen != null){

            sucursalDestino = getSucursal(numeroSucursalDestino);

            if(sucursalDestino != null)
                sucursalOrigen.derivarPeticionesActivas(sucursalDestino);
        }
        return (sucursalDestino!= null);
    }

    //  GETTER AND SETTER
    private Sucursal getSucursal(int nroSucursal){

        Sucursal sucursalBuscada = null;
        for(Sucursal sucursal : sucursales ){
            if(sucursal.getNumero() == nroSucursal){
                sucursalBuscada = sucursal;
                break;
            }
        }
        return sucursalBuscada;
    }
}