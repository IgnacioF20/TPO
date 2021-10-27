package com.company.Models;

import com.company.Enum.CargoEnum;

import java.util.Date;

public class Usuario extends Persona{
    private String password;
    private CargoEnum rol;

    public Usuario(int DNI, String email, String nombre, String domicilio, Date fechaDeNacimiento, String password, CargoEnum rol) {
        super(DNI, email, nombre, domicilio, fechaDeNacimiento);
        this.password = password;
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public CargoEnum getRol() {
        return rol;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRol(CargoEnum rol) {
        this.rol = rol;
    }
}
