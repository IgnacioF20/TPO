package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmLaboratorioPrincipal extends JDialog{
    private JPanel PnlPrincipal;
    private JButton sucursalesButton;
    private JButton practicasButton;
    private JButton usuariosButton;
    private FrmLaboratorioPrincipal self;

    public FrmLaboratorioPrincipal(Window owner, String titulo) {


        super(owner,"Pantalla Principal");

        this.setContentPane(PnlPrincipal);
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
                FrmSucursalLista frame = new FrmSucursalLista(self,"Sucursales");
                frame.setVisible(true);

            }
        });
        practicasButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        usuariosButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                FrmUsuariosLista frame = new FrmUsuariosLista(self,"Usuarios");
                frame.setVisible(true);
            }
        });


    }

}
