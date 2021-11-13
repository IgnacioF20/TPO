package vistas;

import com.company.controllers.LaboratorioController;
import com.company.controllers.PacienteController;
import com.company.controllers.PracticaController;
import com.company.controllers.UsuarioController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FrmLogIn extends JFrame {
    private JPanel JPanel;
    private JTextField txtDNI;
    private JButton iniciarSesiónButton;
    private JPasswordField jpassPassword;
    private  FrmPantallaPrincipal self;


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

                String DNI, password;

                DNI = txtDNI.getText();
                password = jpassPassword.getText();


                System.out.println("DNI Type"+DNI.getClass());
                System.out.println("Password Type"+password.getClass());
                System.out.println("DNI: "+DNI+" | Password: "+password);


                boolean usuarioValidado = UsuarioController.getInstance().validarCredenciales(DNI  ,password);

                String mensaje;
                String titulo;

                if (usuarioValidado){
                    mensaje = "Bienvenido\n Has ingresado satisfactoriamente al sistema";
                    titulo = "Mensaje de bienvenida";
                }
                else{
                    mensaje = "Acceso denegado:\nPor favor ingrese un usuario y/o contraseña correctos";
                    titulo = "Acceso denegado";
                }

                JOptionPane.showMessageDialog(null, mensaje, titulo,JOptionPane.INFORMATION_MESSAGE);

                if(usuarioValidado){
                    FrmLaboratorioPrincipal frame = new FrmLaboratorioPrincipal(self,"Pantalla Principal");
                    frame.setVisible(true);
                }
            }
        });
    }
}

