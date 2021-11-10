package com.company.controllers;

import java.util.ArrayList;

import com.company.dto.UsuarioDTO;
import com.company.models.Practica;
import com.company.models.Usuario;

public class UsuarioController {
    private int numero;
    static UsuarioController instance = null;
    ArrayList<Usuario> usuarios;

    private UsuarioController(){
        this.numero = 0;
        usuarios = new ArrayList();
    }

    public static UsuarioController getInstance(){
        if(instance == null){
            instance = new UsuarioController();
        }
        return instance;
    }

    private void incrementar(int valor){
        this.numero += valor;
    }

    public int getNumero(){
        return this.numero;
    }


    public boolean altaUsuario(UsuarioDTO usuario){
        if(obtenerUsuarioPorDNI(usuario.getDNI()) == null){
            this.usuarios.add(dtoToModel(usuario));
            return true;
        }
        else
            return false;
    }
    private Usuario obtenerUsuarioPorDNI(int DNI){
        Usuario usuarioBuscado = null;
        for(Usuario usuario : usuarios){
            if(usuario.getDNI() == DNI){
                usuarioBuscado = usuario;
                break;
            }
        }
        return usuarioBuscado;
    }
    public boolean validarCredenciales(int DNI, String password){
        Usuario usuarioBuscado = obtenerUsuarioPorDNI(DNI);
        if (usuarioBuscado != null &&  usuarioBuscado.getPassword() == password)
            return true;
        else
            return false;
    }
    private static Usuario dtoToModel(UsuarioDTO usuario){
        Usuario usuarioNuevo = new Usuario(usuario.getDNI(), usuario.getEmail(), usuario.getNombre(), usuario.getDomicilio(), usuario.getFechaDeNacimiento(),usuario.getPassword(), usuario.getCargo());
        return usuarioNuevo;
    }

}
