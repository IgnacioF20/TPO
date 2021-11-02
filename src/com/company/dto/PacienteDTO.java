package com.company.dto;

import com.company.enumerate.SexoEnum;

import java.util.Date;

public class PacienteDTO {
    private int DNI;
    private String email;
    private String nombre;
    private String domicilio;
    private Date fechaDeNacimiento;
    private SexoEnum sexo;

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public SexoEnum getSexo() {
        return sexo;
    }

    public void setSexo(SexoEnum sexo) {
        this.sexo = sexo;
    }

    public PacienteDTO(int DNI, String email, String nombre, String domicilio, Date fechaDeNacimiento, SexoEnum sexo) {
        this.DNI = DNI;
        this.email = email;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sexo = sexo;
    }
}
