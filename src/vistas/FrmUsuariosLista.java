package vistas;

import com.company.controllers.UsuarioController;
import com.company.models.Usuario;
import com.company.utils.TableUsuarios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class FrmUsuariosLista extends JDialog{


    private JPanel pnlUsuarios;

    private JPanel JPHeader;
    private JButton btnSesionUsuarios;
    private JPanel JPBody;
    private JPanel JPTitle;
    private JPanel JPList;
    private JTable tablaUsuarios;
    private JPanel JPNew;
    private JButton btnCrearUsuario;
    private FrmUsuariosLista self;

    private TableUsuarios modeloTablaUsuarios = new TableUsuarios();


    public FrmUsuariosLista(Window owner, String titulo){

        super(owner,"Seleccionar Usuario");

        this.setContentPane(pnlUsuarios);
        this.setSize(400,400);
        this.setModal(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        tablaUsuarios.setModel(modeloTablaUsuarios);
        ArrayList<Usuario> usuarios = UsuarioController.getInstance().getUsuarios();

        String dni, nombre;
        for (Usuario usuario:usuarios) {

            dni = usuario.getDni();
            nombre = usuario.getNombre();
            modeloTablaUsuarios.add(dni, nombre);
        }

        tablaUsuarios.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });

        btnCrearUsuario.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                FrmUsuarioCrear frame = new FrmUsuarioCrear(self,"Crear Usuarios");
                frame.setVisible(true);
            }
        });
    }
}