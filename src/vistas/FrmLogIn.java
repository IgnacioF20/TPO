package vistas;

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
    char clave[]=jpassPassword.getPassword();
    String clavedef=new String(clave);

    public FrmLogIn (String titulo){

        super(titulo);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        this.setContentPane(JPanel);
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //establezco comportamiento al cerrarse
        this.setLocationRelativeTo(null); //que la pantalla inicie centrada
        this.asociarEventos();
        this.setResizable(false);

        iniciarSesiónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String DNI = txtDNI.getText();
                String password = jpassPassword.getText();

                if (DNI.equals("1") && password.equals("12")){
                    FrmLogIn.super.dispose();
                    JOptionPane.showMessageDialog(null, "Bienvenido\n Has ingresado "
                                    + "satisfactoriamente al sistema", "Mensaje de bienvenida",
                            JOptionPane.INFORMATION_MESSAGE);
                    FrmPantallaPrincipal frame = new FrmPantallaPrincipal(self,"Pantalla Principal");
                    frame.setVisible(true);

                }
                else{

                    JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                                    + "Por favor ingrese un usuario y/o contraseña correctos",
                            "Acceso denegado", JOptionPane.ERROR_MESSAGE);
                }
            }
        });




    }




    private void asociarEventos()
    {

    }

    public static void main(String[] args) {

        FrmLogIn frame = new FrmLogIn("Sistema de Laboratorio");
        frame.setVisible(true);
    }

}
