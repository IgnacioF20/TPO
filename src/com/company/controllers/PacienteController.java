package com.company.controllers;

import com.company.dto.PacienteDTO;
import com.company.enumerate.SexoEnum;
import com.company.models.Paciente;
import java.util.ArrayList;
import java.util.Date;

public class PacienteController {
    private ArrayList<Paciente> Pacientes = new ArrayList();

    public boolean NuevoPaciente(PacienteDTO p){
        boolean flag;
        if(ObtenerPacientePorDNI(p.getDNI()) != null){
            this.listaDePaciente.add(dtoToModel(p));
            return true;
        }else{
            return false;
        }
    }
    private Paciente ObtenerPacientePorDNI(int dni){
        Paciente retorno = null;
        for(Paciente paciente : pacientes){
            if(paciente.GetDNI() == dni){
                retorno = paciente;
                break;
            }
        }
        return retorno;
    }

    private static Paciente dtoToModel(PacienteDTO p){
        //mapear con el mismo orden

        Paciente nuevoPaciente = new Paciente(p.getDNI(),p.getEmail());

        return nuevoPaciente;


    }



    public boolean ObtenerPacientePorDNI(int DNI, String email, String nombre, String domicilio, Date fechaDeNacimiento, SexoEnum sexo, int edad){

    }


}
