package com.company.controllers;

import com.company.dto.SucursalDTO;
import com.company.models.Sucursal;
import java.util.ArrayList;

public class LaboratorioController {

    ArrayList<Sucursal> sucursales = new ArrayList();


    public boolean altaSucursal(SucursalDTO sucursal){

        // El numero de sucursal se asigna automaticamente al generarse la sucursal.
        // El identificador de duplicado puede ser la direccion de la sucursal.
        if(estaCargada(sucursal.getDirección())){
            this.sucursales.add(dtoToModel(sucursal));
            return true;
        }
        else
            return false;
    }


    private Sucursal obtenerSucursal(int nroSucursal){
        Sucursal sucursalBuscada = null;
        for(Sucursal sucur : sucursales ){
            if(sucur.getNumero() == nroSucursal){
                sucursalBuscada = sucur;
                break;
            }
        }
        return sucursalBuscada;
    }


    private boolean estaCargada(String direccion){

        boolean cargada = false;

        for(Sucursal sucursal : sucursales ){
            if(sucursal.getDirección() == direccion){
                cargada = true;
                break;
            }
        }
        return cargada;
    }


    private Sucursal dtoToModel(SucursalDTO sucursal){
        Sucursal sucursalNueva = new Sucursal(sucursal.getNumero(), sucursal.getDirección(), sucursal.getResponsableTecnico());
        return sucursalNueva;
    }


    public boolean modificarSucursal(SucursalDTO sucursal){


//        Como modificar sucursal porque el DTO no debería incluir el numero de sucursal
//        Numero de sucursal es un id
        Sucursal sucursalAEditar = obtenerSucursal(sucursal.getNumero());

        if(sucursalAEditar != null){
            sucursalAEditar.setDirección(sucursal.getDirección());
            sucursalAEditar.setNumero(sucursal.getNumero());
            sucursalAEditar.setResponsableTecnico(sucursal.getResponsableTecnico());
            return true;
        }
        else
            return false;
    }


    //IMPORTANTE
    //como hacer para obtener las peticiones de las sucursales
    // tenemos 2 array list? o vamos directamente buscando por el Paciente?
    // como se manejan las listas de agregacion?
    public boolean tienePeticionesActivas(int nroSucursal){
        Sucursal sucursal = obtenerSucursal(nroSucursal);
        if(sucursal == null){
            //OBTENER las peticiones de las sucursales
            ;
        }
        return true;
    }

    // IMPORTANTE
    // Como hacer para dar de baja la sucursal
    // como hacer para obtener la sucursal nueva donde se deben pasar las peticiones activas
    // El resto publico para llamar desde la vista
    public boolean bajaSucursal(SucursalDTO sucursalAEliminar, SucursalDTO sucursalAPasarPeticiones){
        if(obtenerSucursal(sucursalAEliminar.getNumero()) != null && obtenerSucursal(sucursalAPasarPeticiones.getNumero()) != null){
            if(tienePeticionesActivas(sucursalAEliminar.getNumero())){
                if(derivarPeticionesActivas(sucursalAEliminar, sucursalAPasarPeticiones)){
                    return eliminarSucursal(sucursalAEliminar);
                }
            }
        }
        return false;
    }


    private boolean eliminarSucursal(SucursalDTO sucursal){
        if(this.sucursales.remove(sucursal)){
            return true;
        }else{
            return false;
        }
    }


    //falta este
    //Sucursales no pueden ser eliminadas si tienen una petición con resultados finalizados
    private boolean derivarPeticionesActivas(SucursalDTO sucursalDesde, SucursalDTO sucursalHasta){
        for(Sucursal sucur : sucursales ){
            if(sucur.getNumero() == sucursalDesde.getNumero()){
                //recorrer peticiones activas
                //y modificar sucursal a la peticion

                peticion.set
                break;
            }
        }
        return false;
    }
}