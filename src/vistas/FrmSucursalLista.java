package vistas;

import com.company.controllers.LaboratorioController;
import com.company.models.Sucursal;
import com.company.utils.TableSucursales;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class FrmSucursalLista extends JDialog {

    private JPanel pnlPrincipal;
    private JButton button1;
    private JButton crearButton;
    private JTable tablaSucursales;
    private FrmSucursalLista self;

    private TableSucursales modeloTablaSucursales = new TableSucursales();

    public FrmSucursalLista(Window owner, String titulo){
        super(owner,"Seleccione sucursal");

        this.setContentPane(pnlPrincipal);
        this.setSize(400,400);
        this.setModal(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.asociarEventos();

        tablaSucursales.setModel(modeloTablaSucursales);
        ArrayList<Sucursal> sucursales = LaboratorioController.getInstance().getSucursales();

        String numero, dirección, responsableTecnico;
        for (Sucursal sucursal:sucursales){
            numero = sucursal.getNumero();
            dirección = sucursal.getDirección();
            responsableTecnico = sucursal.getResponsableTecnico();
            modeloTablaSucursales.add(numero, dirección, responsableTecnico);
        }

        tablaSucursales.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
    }
    private void asociarEventos(){
        crearButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                FrmSucursalCrear frame = new FrmSucursalCrear(self,"Usuarios");
                frame.setVisible(true);

            }
        });


    }
}
