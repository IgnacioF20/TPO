package vistas;

import com.company.controllers.UsuarioController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FrmLogIn extends JFrame {

    private JPanel JPanel;
    private JTextField txtDNI;
    private JButton iniciarSesiónButton;
    private JPasswordField jpassPassword;
    private FrmPantallaPrincipal self;


    public FrmLogIn (String titulo){

        super(titulo);

//        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (UnsupportedLookAndFeelException e) {
//            e.printStackTrace();
//        }

        this.setContentPane(JPanel);
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //establezco comportamiento al cerrarse
        this.setLocationRelativeTo(null); //que la pantalla inicie centrada
        this.setResizable(false);

        iniciarSesiónButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String dni, contrasenia;

                dni = txtDNI.getText();
                contrasenia = jpassPassword.getText();

                dni = "0";
                contrasenia = "admin";

                boolean usuarioValidado = UsuarioController.getInstance().validarCredenciales(dni, contrasenia);

                if (usuarioValidado){
                    FrmLaboratorioPrincipal frame = new FrmLaboratorioPrincipal(self,"Pantalla Principal");
                    frame.setVisible(true);
                }
                else{
                    String mensaje = "Acceso denegado:\nPor favor ingrese un usuario y/o contraseña correctos";
                    String titulo = "Acceso denegado";
                    JOptionPane.showMessageDialog(null, mensaje, titulo,JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}

