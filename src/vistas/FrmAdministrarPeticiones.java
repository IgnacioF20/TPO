package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FrmAdministrarPeticiones extends JDialog{


    private JPanel pnlPrincipal;
    private JPanel pnlData;
    private JTextField ingreseDNIDelPacienteTextField;
    private JButton irButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton eliminarButton;
    private JButton guardarButton;


    public FrmAdministrarPeticiones(Window owner, String titulo) {

        super(owner,"Administrar Peticiones");

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


        this.setContentPane(pnlPrincipal);
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //establezco comportamiento al cerrarse
        this.setLocationRelativeTo(null); //que la pantalla inicie centrada
        //this.asociarEventos();
        this.setResizable(false);
        this.setModal(true);

        ingreseDNIDelPacienteTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {

            }
        });
    }
}
