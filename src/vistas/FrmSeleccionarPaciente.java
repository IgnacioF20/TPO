package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmSeleccionarPaciente extends JDialog {

    private JPanel pnlPrincipal;
    private JButton button1;
    private JList list1;
    private JButton crearButton;

    public FrmSeleccionarPaciente(Window owner, String titulo){
        super(owner,"Seleccione sucursal");

        this.setContentPane(pnlPrincipal);
        this.setSize(400,400);
        this.setModal(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);



    }



}
