package com.company.controllers;

import com.company.dto.PacienteDTO;
import com.company.dto.PeticionDTO;
import com.company.dto.SucursalDTO;
import com.company.models.Paciente;
import com.company.models.Peticion;
import com.company.models.Sucursal;

import java.util.ArrayList;
import java.util.Date;


public class PacienteController {

    ArrayList<Paciente> pacientes = new ArrayList();

    public boolean altaPaciente(PacienteDTO paciente){
        if(obtenerPacientePorDNI(paciente.getDNI()) == null){
            this.pacientes.add(pacientedtoToModel(paciente));
            return true;
        }
        else
            return false;
    }
    public boolean modificarPaciente(PacienteDTO paciente){
        Paciente pacienteAModificar = obtenerPacientePorDNI(paciente.getDNI());
        if(pacienteAModificar != null){
            pacienteAModificar.setDNI(paciente.getDNI());
            pacienteAModificar.setDomicilio(paciente.getDomicilio());
            pacienteAModificar.setEdad(paciente.getEdad());
            pacienteAModificar.setEmail(paciente.getEmail());
            pacienteAModificar.setNombre(paciente.getNombre());
            pacienteAModificar.setFechaDeNacimiento(paciente.getFechaDeNacimiento());
            pacienteAModificar.setSexo(paciente.getSexo());
            return true;
        }
        else
            return false;
    }
    public boolean bajaPaciente(PacienteDTO paciente){
        if(obtenerPacientePorDNI(paciente.getDNI()) != null){
            this.pacientes.remove(pacientedtoToModel(paciente));
            return true;
        }
        else
            return false;
    }
    //REVISAR
    //No entiendo por que no aparece peticiones
    public boolean altaPeticion(PacienteDTO paciente, PeticionDTO peticion){
        Paciente pacienteAUtilizar = obtenerPacientePorDNI(paciente.getDNI());
        if(pacienteAUtilizar != null){
            pacienteAUtilizar.peticiones.add(peticiondtoToModel(peticion));
            return true;
        }
        else
            return false;
    }

    public boolean modificarPeticion(){

        return false;
    }


    public Peticion consultarPeticion(){


        return null;
    }


    private Paciente obtenerPacientePorDNI(int dni){
        Paciente pacienteBuscado = null;
        for(Paciente paciente : pacientes){
            if(paciente.getDNI() == dni){
                pacienteBuscado = paciente;
                break;
            }
        }
        return pacienteBuscado;
    }
    private static Paciente pacientedtoToModel(PacienteDTO paciente){
        Paciente pacienteNuevo = new Paciente(paciente.getDNI(), paciente.getEmail(), paciente.getNombre(), paciente.getDomicilio(), paciente.getFechaDeNacimiento(), paciente.getSexo());
        return pacienteNuevo;
    }
    private static Peticion peticiondtoToModel(PeticionDTO peticion){
        Peticion peticionNueva = new Peticion(peticion.getObraSocial(), peticion.getFechaCarga(), peticion.getFechaEntrega(), peticion.isFinalizada());
            return peticionNueva;
    }
}
