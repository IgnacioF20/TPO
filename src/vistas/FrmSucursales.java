package vistas;

import javax.swing.*;

public class FrmSucursales extends JFrame {
    private JTabbedPane pnlPrincipal;
    private JPanel panel1;
    private JTextField textField1;
    private JButton buscarButton;
    private JButton guardarButton1;
    private JButton eliminarButton;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;

    public FrmSucursales(String titulo){
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
