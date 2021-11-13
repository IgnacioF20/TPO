package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmLaboratorioPrincipal extends JFrame{
    private JPanel PnlPrincipal;
    private JButton sucursalesButton;
    private JButton practicasButton;
    private JButton usuariosButton;

    public FrmLaboratorioPrincipal(Window owner, String titulo) {


        super(owner,"Pantalla Principal");

        this.setContentPane(JPanel);
        this.setSize(400,400);
        this.setModal(true); //no permite volver a la pantalla anterior hasta cerrar la actual
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //establezco comportamiento al cerrarse
        this.setLocationRelativeTo(null); //que la pantalla inicie centrada
        this.asociarEventos();
        this.setResizable(false);



    }
    private void asociarEventos(){
        sucursalesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmSeleccionarSucursal frame = new FrmSeleccionarSucursal(self,"Sucursales");
                frame.setVisible(true);

            }
        });
        practicasButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        usuariosButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

    }

}
