package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmPacientes extends JDialog {

    private JPanel pnlPrincipal;
    private JTextField txtDNI;
    private JButton buscarButton;
    private JButton guardarButton;
    private JButton eliminarButton;
    private JButton administrarPeticionesButton;
    private JTextField txtNombre;
    private JTextField txtDomicilio;
    private JTextField txtMail;
    private JTextField txtSexo;
    private JTextField txtEdad;
    private JTextField textField1;
    private  FrmPacientes self;

    public FrmPacientes(Window owner, String titulo){
        super(owner,"Pacientes");

        this.setContentPane(pnlPrincipal);
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //establezco comportamiento al cerrarse
        this.setLocationRelativeTo(null); //que la pantalla inicie centrada
        this.asociarEventos();
        this.setResizable(false);
        this.setModal(true);

        administrarPeticionesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmAdministrarPeticiones frame = new FrmAdministrarPeticiones(self,"Administrar Peticiones");
                frame.setVisible(true);
            }
        });
    }
    private void asociarEventos()
    {

    }


}
