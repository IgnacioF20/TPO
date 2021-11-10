package com.company.controllers;

import com.company.dto.PacienteDTO;
import com.company.dto.PracticaDTO;
import com.company.models.*;

import java.util.ArrayList;

public class PracticaController {
    static PracticaController instance = null;
    ArrayList<Practica> practicas;

    private PracticaController(){
        this.numero = 0;
        practicas = new ArrayList();
    }

    public static PracticaController getInstance(){
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
    //IMPORTANTE
    //revisar si este comportamiento es correcto
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
    public boolean bajaPractica(PracticaDTO practica){
        if(obtenerPracticaPorCodigo(practica.getCodigoPractica()) != null){

            // IMPORTANTE
            // aca falta hacer el recorrido en todas las peticiones
            // si existe la practica en alguna peticion
            // no se puede eliminar esta practica

            this.practicas.remove(practicadtoToModel(practica));
            return true;
        }
        else
            return false;
    }
    public boolean inhabilitarUso(PracticaDTO practica){
        Practica practicaAModificar = obtenerPracticaPorCodigo(practica.getCodigoPractica());
        if(practicaAModificar != null){
            practicaAModificar.setUsoHabilitado(false);
            return true;
        }
        else
            return false;
    }
    private boolean enUso(PracticaDTO practica){
        Practica practicaABuscar = obtenerPracticaPorCodigo(practica.getCodigoPractica());
        if(practicaABuscar != null){
            return practicaABuscar.isUsoHabilitado();
        }
        else
            return false;
    }
    //IMPORTANTE
    //REVISAR RANGO VALORES, ALGO ESTA MAL
    private static Practica practicadtoToModel(PracticaDTO practica){
        Practica practicaNueva = new Paciente(practica.getCodigoPractica(),practica.getNombrePractica(), practica.isUsoHabilitado(), practica.getCantHorasResultado(), practica.getValoresCriticos(),practica.getValoresReservados());
        return practicaNueva;
    }

}
