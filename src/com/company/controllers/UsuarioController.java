package com.company.controllers;

import java.util.ArrayList;

import com.company.dto.PacienteDTO;
import com.company.dto.UsuarioDTO;
import com.company.models.Paciente;
import com.company.models.Usuario;

public class UsuarioController {

    ArrayList<Usuario> usuarios = new ArrayList<>();

    public boolean altaUsuario(UsuarioDTO usuario){

        return true;
    }

    private Usuario obtenerUsuarioPorDNI(int dni){

        Usuario usuarioBuscado = null;

        for(Usuario usuario : usuarios){

            if(usuario.getDNI() == dni){

                usuarioBuscado = usuario;
                break;
            }
        }
        return usuarioBuscado;
    }


    private static Usuario dtoToModel(UsuarioDTO usuario){

        //mapear con el mismo orden
        Usuario usuarioNuevo = new Usuario(usuario.getDNI(), usuario.getEmail(), usuario.getNombre(), usuario.getDomicilio(), usuario.getFechaDeNacimiento(),usuario.getPassword(), usuario.getCargo());
        return usuarioNuevo;
    }

}
