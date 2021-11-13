package com.company.dto;

import com.company.enumerate.SexoEnumerate;
import com.company.models.Peticion;

import java.util.ArrayList;
import java.util.Date;

public class PacienteDTO {

    private String DNI;
    private String email;
    private String nombre;
    private String domicilio;
    private String fechaDeNacimiento;
    private SexoEnumerate sexo;
    private int edad;

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
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

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public SexoEnumerate getSexo() {
        return sexo;
    }

    public void setSexo(SexoEnumerate sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public PacienteDTO(String DNI, String email, String nombre, String domicilio, String fechaDeNacimiento, SexoEnumerate sexo) {
        this.DNI = DNI;
        this.email = email;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sexo = sexo;
    }
}
