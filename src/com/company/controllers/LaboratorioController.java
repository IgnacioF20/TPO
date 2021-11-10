package com.company.controllers;

import com.company.dto.SucursalDTO;
import com.company.models.Paciente;
import com.company.models.Peticion;
import com.company.models.Sucursal;
import java.util.ArrayList;

public class LaboratorioController {
    static LaboratorioController instance = null;
    ArrayList<Sucursal> sucursales;
    ArrayList<Peticion> peticiones;

    private LaboratorioController(){
        sucursales = new ArrayList();
        peticiones = new ArrayList();
    }


    public static LaboratorioController getInstance(){
        if(instance == null){
            instance = new LaboratorioController();
        }
        return instance;
    }


    public boolean altaSucursal(SucursalDTO sucursal){
        if(obtenerSucursal(sucursal.getNumero()) != null){
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


    public boolean tienePeticionesActivas(int nroSucursal){
        Sucursal sucursal = obtenerSucursal(nroSucursal);
        if(sucursal == null){
            for(Peticion peticion : peticiones ){
                if(peticion.estaActiva()){
                    return true;
                }
            }
        }
        return false;
    }


    // IMPORTANTE - CHECKEAR
    // Como hacer para dar de baja la sucursal
    // como hacer para obtener la sucursal nueva donde se deben pasar las peticiones activas
    // El resto publico para llamar desde la vista
    public boolean bajaSucursal(SucursalDTO sucursalAEliminar, SucursalDTO sucursalAPasarPeticiones){
        if(obtenerSucursal(sucursalAEliminar.getNumero()) != null && obtenerSucursal(sucursalAPasarPeticiones.getNumero()) != null){
            if(tienePeticionesActivas(sucursalAEliminar.getNumero())){
                derivarPeticionesActivas(sucursalAEliminar, sucursalAPasarPeticiones);
            }
            return eliminarSucursal(sucursalAEliminar);
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


    private void derivarPeticionesActivas(SucursalDTO sucursalDesde, SucursalDTO sucursalHasta){
        for(Peticion peticion : peticiones ){
            if(peticion.getSucursal().getNumero() == sucursalDesde.getNumero()){
                peticion.setSucursal(dtoToModel(sucursalHasta));
            }
        }
    }


}