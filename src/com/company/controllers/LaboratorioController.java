package com.company.controllers;

import com.company.dto.SucursalDTO;
import com.company.models.Peticion;
import com.company.models.Sucursal;
import java.util.ArrayList;

public class LaboratorioController {

    static LaboratorioController instance = null;
    ArrayList<Sucursal> sucursales;
    ArrayList<Peticion> peticiones;

    //  CONSTRUCTOR
    private LaboratorioController(){
        sucursales = new ArrayList();
        peticiones = new ArrayList();
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

    // IMPORTANTE - CHECKEAR
    // Como hacer para dar de baja la sucursal
    // como hacer para obtener la sucursal nueva donde se deben pasar las peticiones activas
    // El resto publico para llamar desde la vista
    public boolean bajaSucursal(SucursalDTO dto){

        Sucursal sucursalAEliminar = getSucursal(dto.getNumero());

        if(sucursalAEliminar != null){

            if(tienePeticionesActivas(sucursalAEliminar.getNumero())){

                this.sucursales.remove(sucursal)

                derivarPeticionesActivas(sucursalAEliminar, sucursalAPasarPeticiones);
            }
            return eliminarSucursal(sucursalAEliminar);
        }
        return false;
    }


    public boolean eliminarSucursal(SucursalDTO sucursal){

        if(this.sucursales.remove(sucursal)){
            return true;
        }else{
            return false;
        }
    }


    public boolean tienePeticionesActivas(int nroSucursal){

        Sucursal sucursal = getSucursal(nroSucursal);
        if(sucursal == null){
            for(Peticion peticion : peticiones ){
                if(peticion.estaActiva()){
                    return true;
                }
            }
        }
        return false;
    }


    public void derivarPeticionesActivas(SucursalDTO sucursalDesde, SucursalDTO sucursalHasta){

        for(Peticion peticion : peticiones ){
            if(peticion.getSucursal().getNumero() == sucursalDesde.getNumero()){
                peticion.setSucursal(dtoToModel(sucursalHasta));
            }
        }
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