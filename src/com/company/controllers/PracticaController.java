package com.company.controllers;

import com.company.dto.PacienteDTO;
import com.company.dto.PracticaDTO;
import com.company.models.*;

import java.util.ArrayList;

public class PracticaController {
    static PracticaController instance = null;
    ArrayList<Practica> practicas;

    private PracticaController(){
        practicas = new ArrayList();
    }

    public static synchronized PracticaController getInstance(){
        if(instance == null){
            instance = new PracticaController();
        }
        return instance;
    }

    public boolean altaPractica(PracticaDTO practica){
        if(obtenerPracticaPorCodigo(practica.getCodigoPractica()) == null){
            this.practicas.add(practicadtoToModel(practica));
            return true;
        }
        else
            return false;
    }
    private Practica obtenerPracticaPorCodigo(int codigoPractica){
        Practica PracticaBuscada = null;
        for(Practica practica : practicas){
            if(practica.getCodigoPractica() == codigoPractica){
                PracticaBuscada = practica;
                break;
            }
        }
        return PracticaBuscada;
    }

    public boolean modificarPractica(PracticaDTO practica){
        Practica practicaAModificar = obtenerPracticaPorCodigo(practica.getCodigoPractica());
        if(practicaAModificar != null){
            practicaAModificar.setCodigoPractica(practica.getCodigoPractica());
            practicaAModificar.setNombrePractica(practica.getNombrePractica());
            practicaAModificar.setCantHorasResultado(practica.getCantHorasResultado());
            practicaAModificar.setValoresCriticos(practica.getValoresCriticos());
            practicaAModificar.setValoresReservados(practica.getValoresReservados());
            practicaAModificar.setUsoHabilitado(practica.isUsoHabilitado());
            return true;
        }
        else
            return false;
    }
    public boolean bajaPractica(int codigoPractica){
        boolean response = false;
        Practica practica = obtenerPracticaPorCodigo(codigoPractica);
        if(practica != null && !practica.esUsada() ){
            this.practicas.remove(practica);
            response = true;
        }
        return response;
    }
    public boolean inhabilitarUso(int codigoPractica){
        Practica practicaAModificar = obtenerPracticaPorCodigo(codigoPractica);
        if(practicaAModificar != null){
            practicaAModificar.setUsoHabilitado(false);
        }
        return (practicaAModificar != null);
    }
    private boolean enUso(int codigoPractica){
        Practica practicaABuscar = obtenerPracticaPorCodigo(codigoPractica);
        boolean response = false;
        if(practicaABuscar != null){
            response = practicaABuscar.isUsoHabilitado();
        }
        return response;
    }

    private static Practica practicadtoToModel(PracticaDTO practica){
        Practica practicaNueva = new Practica(practica.getCodigoPractica(),practica.getNombrePractica(), practica.getCantHorasResultado(),practica.isUsoHabilitado(), practica.getValoresCriticos(),practica.getValoresReservados());
        return practicaNueva;
    }

}
