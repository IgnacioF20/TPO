package vistas;

import javax.swing.*;

public class FrmSucursales extends JFrame {


    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTextField textField1;
    private JButton buscarButton;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton guardarButton;
    private JButton guardarButton1;
    private JButton cancelarButton1;
    private JButton cancelarButton;
    private JButton eliminarButton;

    public FrmSucursales(String titulo){
        super(titulo);

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
