package com.company.dto;

import com.company.enumerate.CargoEnum;

public class UsuarioDTO {
    private String password;
    private CargoEnum rol;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CargoEnum getRol() {
        return rol;
    }

    public void setRol(CargoEnum rol) {
        this.rol = rol;
    }

    public UsuarioDTO(String password, CargoEnum rol) {
        this.password = password;
        this.rol = rol;
    }
}
