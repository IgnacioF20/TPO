package com.company.DTO;

import com.company.Enum.SexoEnum;

import java.util.Date;

public class PacienteDTO {
    protected int DNI;
    protected String email;
    protected String nombre;
    protected String domicilio;
    protected Date fechaDeNacimiento;
    private SexoEnum sexo;
}
