package com.company.controllers;

import java.util.ArrayList;

import com.company.dto.UsuarioDTO;
import com.company.models.Usuario;

public class UsuarioController {

    ArrayList<Usuario> usuarios = new ArrayList<>();

    public boolean altaUsuario(UsuarioDTO usuario){

        // SI OBTENEMOS NULL, NO SE ENCUENTRA EL USUARIO CARGADO Y PROCEDEMOS A CARGARLO.
        if(obtenerUsuarioPorDNI(usuario.getDNI()) == null){

            this.usuarios.add(dtoToModel(usuario));
            return true;
        }
        // EL USUARIO YA ESTA CARGADO.
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
