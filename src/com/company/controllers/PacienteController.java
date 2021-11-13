package com.company.controllers;

import com.company.dto.PacienteDTO;
import com.company.dto.PeticionDTO;
import com.company.enumerate.SexoEnumerate;
import com.company.models.Paciente;
import com.company.models.Peticion;

import java.util.ArrayList;
import java.util.Date;


public class PacienteController {
    static PacienteController instance = null;
    ArrayList<Paciente> pacientes;

    private PacienteController(){
        pacientes = new ArrayList();
    }

    public static synchronized PacienteController getInstance(){
        if(instance == null){
            instance = new PacienteController();
        }
        return instance;
    }

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
    public boolean bajaPaciente(String dni){
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

    public boolean modificarPeticion(String dni, String idPeticion, PeticionDTO dto){
        Paciente pacienteAUtilizar = obtenerPacientePorDNI(dni);
        Peticion peticion = null;
        if(pacienteAUtilizar != null){
            peticion = pacienteAUtilizar.getPeticion(idPeticion);
            if(peticion != null){
                peticion.setSucursal(dto.getSucursal());
                peticion.setFechaCarga(dto.getFechaCarga());
                peticion.setFinalizada(dto.isFinalizada());
                peticion.setObraSocial(dto.getObraSocial());
            }
        }
        return (peticion != null);
    }

    public Peticion consultarPeticion(String dni, PeticionDTO peticion){
        Paciente pacienteAUtilizar = obtenerPacientePorDNI(dni);
        Peticion peticionACargar = null;
        if(pacienteAUtilizar != null){
            peticionACargar = peticiondtoToModel(peticion);
            pacienteAUtilizar.altaPeticion(peticionACargar);
        }
        return peticionACargar;
    }

    private Paciente obtenerPacientePorDNI(String dni){
        Paciente pacienteBuscado = null;
        for(Paciente paciente : pacientes){
            if(paciente.getDni() == dni){
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
        Peticion peticionNueva = new Peticion(peticion.getObraSocial(), peticion.getFechaCarga(), peticion.getFechaEntrega(), peticion.isFinalizada(), peticion.getSucursal());
        return peticionNueva;
    }
}
