package com.company;

public class Paciente extends Persona{
    private SexoEnum Sexo;
    private int Edad;

    public SexoEnum getSexo() {
        return Sexo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setSexo(SexoEnum sexo) {
        Sexo = sexo;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public Paciente(SexoEnum sexo, int edad) {
        Sexo = sexo;
        Edad = edad;

    }



}
