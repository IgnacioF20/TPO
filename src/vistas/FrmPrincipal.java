package vistas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmPrincipal extends JFrame {

    private JPanel pnlTitulo;
    private JButton btnIniciarSesion;
    private JButton btnRegistrarse;
    private JPanel pnlPrincipal;

    private  FrmPrincipal self;


    public FrmPrincipal(String titulo) //constructor
    {
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

        this.setContentPane(pnlPrincipal);
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //establezco comportamiento al cerrarse
        this.setLocationRelativeTo(null); //que la pantalla inicie centrada
        this.asociarEventos();
        this.self = this; //para poder referenciar FrmPrincipal desde  FrmTabsDemo frame
        this.setResizable(false);

    }

    private void asociarEventos()
    {
        btnIniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmIniciarSesion frame = new FrmIniciarSesion(self,"Iniciar Sesion");
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {

        FrmPrincipal frame = new FrmPrincipal("Sistema de Laboratorio");
        frame.setVisible(true);
    }
}
