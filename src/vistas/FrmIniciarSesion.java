package vistas;

import com.company.controllers.UsuarioController;
import com.company.models.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrmIniciarSesion extends JDialog{

    private JPanel pnlPrincipal;
    private JButton btnOK;
    private JButton volverButton;
    private JTextField txtClave;
    private JTextField txtUsuario;
    private char evt;
    private int dni = 0;
    private String password;

    public FrmIniciarSesion(Window owner, String titulo) //constructor
    {
        super(owner,"Iniciar sesion");

        this.setContentPane(pnlPrincipal);
        this.setModal(true); //no permite volver a la pantalla anterior hasta cerrar la actual
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //establezco comportamiento al cerrarse
        this.setLocationRelativeTo(null); //que la pantalla inicie centrada
        this.setResizable(false);



        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        txtUsuario.addKeyListener(new KeyAdapter() { //valido que el campo usuario sea numerico
            @Override
            public void keyTyped(KeyEvent e) {
                evt = e.getKeyChar();
                if((evt<'0' || evt>'9')) e.consume();

            }
        });

        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dni = Integer.parseInt(txtUsuario.getText());
                password = String.valueOf(txtClave.getText());
                if (dni == 0 || password.isEmpty()) JOptionPane.showMessageDialog(null,"Error");
                else{
                    //UsuarioController.validarCredenciales(dni,password); si devuelve false usal el JoptionPane indicando el error
                    JOptionPane.showMessageDialog(null,"Se cargó"+dni +password);
                }
            }
        });
    }


}
