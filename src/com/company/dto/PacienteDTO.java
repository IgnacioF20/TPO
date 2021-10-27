package com.company.dto;

import com.company.enumerate.SexoEnum;

import java.util.Date;

public class PacienteDTO {
    protected int DNI;
    protected String email;
    protected String nombre;
    protected String domicilio;
    protected Date fechaDeNacimiento;
    private SexoEnum sexo;
}
