package vistas;

import com.company.controllers.LaboratorioController;
import com.company.controllers.PacienteController;
import com.company.controllers.PracticaController;
import com.company.controllers.UsuarioController;
import com.company.dto.SucursalDTO;
import com.company.dto.UsuarioDTO;
import com.company.enumerate.CargoEnumerate;

import javax.swing.*;
import java.awt.event.*;
import java.util.Date;

public class main{

    public static void main(String[] args) {

        class Controllers{
            LaboratorioController laboratorioController;
            PacienteController pacienteController;
            PracticaController practicaController;
            UsuarioController usuarioController;
        }

        Controllers controllers = new Controllers();

        controllers.laboratorioController = LaboratorioController.getInstance();
        controllers.pacienteController = PacienteController.getInstance();
        controllers.practicaController = PracticaController.getInstance();
        controllers.usuarioController = UsuarioController.getInstance();

        UsuarioDTO usuarioDTO = new UsuarioDTO(
                "0",
                "admin",
                "admin@sistemalab.com",
                "administrador",
                null,
                null,
                CargoEnumerate.ADMINISTRADOR);

        controllers.usuarioController.altaUsuario(usuarioDTO);

        SucursalDTO sucursalDTO = new SucursalDTO(
                "0001",
                "Lima",
                "Roberto");

        controllers.laboratorioController.altaSucursal(sucursalDTO);


        FrmLogIn frame = new FrmLogIn("Sistema de Laboratorio");
        frame.setVisible(true);
    }
}

