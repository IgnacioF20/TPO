package com.company.dto;

import com.company.enumerate.CargoEnumerate;

import java.util.Date;

public class UsuarioDTO {

    private int DNI;
    private String email;
    private String nombre;
    private String domicilio;
    private Date fechaDeNacimiento;
    private String password;
    private CargoEnumerate cargo;


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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CargoEnumerate getCargo() {
        return cargo;
    }

    public void setCargo(CargoEnumerate cargo) {
        this.cargo = cargo;
    }
}
