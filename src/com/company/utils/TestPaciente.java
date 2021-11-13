package com.company.utils;

public class TestPaciente {
    private String dni;
    private String practica;
    private String valor_critico;

    public TestPaciente(String dni, String practica, String valor_critico){
        this.dni = dni;
        this.practica = practica;
        this.valor_critico = valor_critico;
    }

    public String getDni() {
        return this.dni;
    }
    public String getPractica() {
        return this.practica;
    }
    public String getValor_critico() {
        return this.valor_critico;
    }
}
