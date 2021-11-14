package vistas;

import com.company.controllers.LaboratorioController;
import com.company.dto.SucursalDTO;
import com.company.models.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmSucursalCrear extends JDialog {
    private JTabbedPane pnlPrincipal;
    private JPanel panel1;
    private JTextField JTF_numero;
    private JTextField JTF_direccion;
    private JTextField JTF_responsable;
    private JPanel JPBody;
    private JButton guardarButton;
    private FrmSucursalCrear self;

    public FrmSucursalCrear(Window owner, String titulo){
        super(owner,"Pantalla Principal");

        this.setContentPane(pnlPrincipal);
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //establezco comportamiento al cerrarse
        this.setLocationRelativeTo(null); //que la pantalla inicie centrada
        this.setResizable(false);
        this.setModal(true);

        JTF_numero.getText();
        JTF_direccion.getText();
        JTF_responsable.getText();

        guardarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                LaboratorioController laboratorioController = LaboratorioController.getInstance();

                String numero, dirección, responsableTecnico;

                numero = JTF_numero.getText();
                dirección = JTF_direccion.getText();
                responsableTecnico = JTF_responsable.getText();

                SucursalDTO sucursalDTO = new SucursalDTO(
                        numero,
                        dirección,
                        responsableTecnico);

                laboratorioController.altaSucursal(sucursalDTO);


            }
        });
    }


}
