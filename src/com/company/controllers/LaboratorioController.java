package com.company.controllers;


import com.company.dto.PacienteDTO;
import com.company.dto.SucursalDTO;
import com.company.models.Paciente;
import com.company.models.Peticion;
import com.company.models.Sucursal;
import com.company.models.Usuario;

import java.util.ArrayList;

public class LaboratorioController {
    ArrayList<Sucursal> sucursales = new ArrayList();

    public boolean altaPSucursale(SucursalDTO sucursal){
        // SI OBTENEMOS NULL, PROCEDEMOS A CARGARLO.
        if(obtenerSucursal(sucursal.getNumero()) == null){
            this.sucursales.add(dtoToModel(sucursal));
            return true;
        }
        else
            return false;
    }
    private static Sucursal obtenerSucursal(int nroSucursal){
        Sucursal sucursalBuscada = null;
        for(Sucursal sucur : sucursales ){
            if(sucur.getNumero() == nroSucursal){
                sucursalBuscada = sucur;
                break;
            }
        }
        return sucursalBuscada;
    }
    private static Sucursal dtoToModel(SucursalDTO sucursal){
        Sucursal sucursalNueva = new Sucursal(sucursal.getNumero(), sucursal.getDirección(), sucursal.getResponsableTecnico());
        return sucursalNueva;
    }
    private static boolean modificarSucursal(SucursalDTO sucursal){
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
    private boolean bajaSucursal(SucursalDTO sucursalAEliminar, SucursalDTO sucursalAPasarPeticiones){
        if(obtenerSucursal(sucursalAEliminar.getNumero()) != null && obtenerSucursal(sucursalAPasarPeticiones.getNumero()) != null){
            if(derivarPeticionesActivas(sucursalAEliminar, sucursalAPasarPeticiones)){
                return eliminarSucursal(sucursalAEliminar);
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
        return false;
    }




}
