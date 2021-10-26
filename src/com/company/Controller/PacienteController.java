package com.company.Controller;

import java.util.ArrayList;

public class PacienteController {
    private ArrayList<Paciente> listaDePaciente = new ArrayList();

    public void NuevoPaciente(PacienteDTO p){
        this.listaDePaciente.add(p.toObjet());
    }
}
