package com.company.models;

import com.company.enumerate.CargoEnumerate;

import java.util.Date;

public class Usuario extends Persona{

    private String password;
    private CargoEnumerate cargo;

    public Usuario(String DNI, String email, String nombre, String domicilio, String fechaDeNacimiento, String password, CargoEnumerate cargo) {

        super(DNI, email, nombre, domicilio, fechaDeNacimiento);
        this.password = password;
        this.cargo = cargo;
    }


    @Override
    public String getDni() {
        return super.getDni();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public String getDomicilio() {
        return super.getDomicilio();
    }

    @Override
    public String getFechaDeNacimiento() {
        return super.getFechaDeNacimiento();
    }

    @Override
    public void setDni(String dni) {
        super.setDni(dni);
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void setDomicilio(String domicilio) {
        super.setDomicilio(domicilio);
    }

    @Override
    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        super.setFechaDeNacimiento(fechaDeNacimiento);
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

    public void setRol(CargoEnumerate rol) {
        this.cargo = rol;
    }
}
