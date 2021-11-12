package vistas;

import javax.swing.*;

public class FrmLogIn extends JFrame {
    private JPanel JPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton iniciarSesiónButton;

    public FrmLogIn (String titulo){
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


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }


}
