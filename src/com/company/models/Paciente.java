package com.company.models;

import com.company.enumerate.SexoEnum;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Paciente extends Persona {
    private SexoEnum sexo;
    private int edad;
    private List<Peticion> peticiones = new ArrayList<>();

    public SexoEnum getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setSexo(SexoEnum sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Paciente(int DNI, String email, String nombre, String domicilio, Date fechaDeNacimiento, SexoEnum sexo, int edad) {
        super(DNI, email, nombre, domicilio, fechaDeNacimiento);
        this.sexo = sexo;
        this.edad = edad;
    }

    public int calcularEdad() {
        return this.edad;
    }
    public int GetDNI() {
        return this.DNI;
    }




}
