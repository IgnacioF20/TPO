package vistas;

import javax.swing.*;

public class FrmPacientes extends JFrame {

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

    public FrmPacientes(String titulo){
        super(titulo);

        this.setContentPane(pnlPrincipal);
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //establezco comportamiento al cerrarse
        this.setLocationRelativeTo(null); //que la pantalla inicie centrada
        this.asociarEventos();
        this.setResizable(false);

    }
    private void asociarEventos()
    {

    }


}
