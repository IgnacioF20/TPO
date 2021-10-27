package com.company.Models;

import java.util.Date;

public class Persona {
    protected int DNI;
    protected String email;
    protected String nombre;
    protected String domicilio;
    protected Date fechaDeNacimiento;

    public int getDNI() {
        return DNI;
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Persona(int DNI, String email, String nombre, String domicilio, Date fechaDeNacimiento) {
        this.DNI = DNI;
        this.email = email;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.fechaDeNacimiento = fechaDeNacimiento;

    }
}
