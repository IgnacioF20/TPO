package vistas;

import javax.swing.*;

public class FrmPantallaPrincipal extends JFrame {

    private JPanel JPanel;
    private JPanel pnlMain;
    private JPanel pnlUsuarios;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JPanel pnlPacientes;
    private JPanel pnlPeticiones;
    private JButton button5;
    private JButton button6;
    private JPanel pnlLaboratorio;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;

    public FrmPantallaPrincipal(String titulo){
        super(titulo);

        this.setContentPane(JPanel);
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
