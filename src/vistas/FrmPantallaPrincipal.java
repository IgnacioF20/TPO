package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmPantallaPrincipal extends JDialog {

    private JPanel JPanel;
    private JPanel pnlMain;
    private JPanel pnlUsuarios;
    private JButton administrarUsuariosButton;
    private JButton administrarSucursalesButton;
    private JButton administrarPacientesButton;
    private JButton consultarPeticionesButton;
    private JPanel pnlPacientes;
    private JPanel pnlPeticiones;
    private JButton administrarPeticionesButton;
    private JButton consultarPeticionesButton1;
    private JPanel pnlLaboratorio;
    private JButton aministrarPracticasButton;
    private JButton cargarResultadosButton;
    private JButton button9;
    private JButton resultadosCriticosButton;
    private JButton btnSalir;
    private  FrmPantallaPrincipal self;


    public FrmPantallaPrincipal(Window owner, String titulo){
        super(owner,"Pantalla Principal");


        this.setContentPane(JPanel);
        this.setSize(400,400);
        this.setModal(true); //no permite volver a la pantalla anterior hasta cerrar la actual
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //establezco comportamiento al cerrarse
        this.setLocationRelativeTo(null); //que la pantalla inicie centrada
        this.asociarEventos();
        this.setResizable(false);



    }
    private void asociarEventos()
    {
        resultadosCriticosButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmResultadosCriticos frame = new FrmResultadosCriticos(self,"Resultados Criticos");
                frame.setVisible(true);
            }
        });
        administrarSucursalesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmSucursales frame = new FrmSucursales(self,"Sucursales");
                frame.setVisible(true);

            }
        });
        administrarPacientesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmPacientes frame = new FrmPacientes(self,"Pacientes");
                frame.setVisible(true);

            }
        });
        administrarUsuariosButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmUsuarioCrear frame = new FrmUsuarioCrear(self,"Usuarios");
                frame.setVisible(true);

            }
        });
        administrarPeticionesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmAdministrarPeticiones frame = new FrmAdministrarPeticiones(self,"Usuarios");
                frame.setVisible(true);
            }
        });

    }





}
