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
            pacienteAModificar.setDomicilio(paciente.getDomicilio());
            pacienteAModificar.setEmail(paciente.getEmail());
            pacienteAModificar.setNombre(paciente.getNombre());
            pacienteAModificar.setFechaDeNacimiento(paciente.getFechaDeNacimiento());
            pacienteAModificar.setSexo(paciente.getSexo());
            return true;
        }
        else
            return false;
    }
    public boolean bajaPaciente(int dni){
        Paciente paciente = obtenerPacientePorDNI(dni);
        if(!paciente.tienePeticionCompleta()){
            this.pacientes.remove(paciente);
            return true;
        }
        else
            return false;
    }
    public boolean altaPeticion(PacienteDTO paciente, PeticionDTO peticion){
        Paciente pacienteAUtilizar = obtenerPacientePorDNI(paciente.getDNI());
        if(pacienteAUtilizar != null){
            pacienteAUtilizar.altaPeticion(peticiondtoToModel(peticion));
            return true;
        }
        else
            return false;
    }

    //IMPORTANTE
    //como obtener el ID
    //como consultar con un DTO el ID
    public boolean modificarPeticion(int dni, int id){
        Paciente pacienteAUtilizar = obtenerPacientePorDNI(dni);
        if(pacienteAUtilizar != null){
            Peticion peticion;

            pacienteAUtilizar.modificarPeticion();

                    altaPeticion(peticiondtoToModel(peticion));
            return true;
        }
        return false;
    }


    public Peticion consultarPeticion(PacienteDTO paciente, PeticionDTO peticion){
        Paciente pacienteAUtilizar = obtenerPacientePorDNI(paciente.getDNI());
        if(pacienteAUtilizar != null){
            pacienteAUtilizar.altaPeticion(peticiondtoToModel(peticion));
            return true;
        }

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
