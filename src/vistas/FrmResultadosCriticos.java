package vistas;

import com.company.utils.TableModel;

import javax.swing.*;
import java.awt.*;

public class FrmResultadosCriticos extends JDialog {

    private JPanel pnlPrincipal;
    private JTable tablaPaciente;

    private TableModel miModelo = new TableModel();

    public FrmResultadosCriticos(Window owner, String titulo){
        super(owner," ");

        this.setContentPane(pnlPrincipal);
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //establezco comportamiento al cerrarse
        this.setLocationRelativeTo(null); //que la pantalla inicie centrada
        this.asociarEventos();
        this.setResizable(false);
        this.setModal(true);

        tablaPaciente.setModel(miModelo);
        miModelo.add("10101010", "Análisis", "300");
        miModelo.add("13123123", "Ecografía", "300");
        miModelo.add("10111010", "Ecografía", "300");
        miModelo.add("10155010", "Ecografía", "300");
        miModelo.add("11231010", "Análisis", "300");
        miModelo.add("10111010", "Análisis", "300");

    }
    private void asociarEventos()
    {

    }
}
