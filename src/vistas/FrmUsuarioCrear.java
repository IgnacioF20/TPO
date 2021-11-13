package vistas;

import com.company.controllers.UsuarioController;
import com.company.dto.UsuarioDTO;
import com.company.enumerate.CargoEnumerate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmUsuarioCrear extends JDialog{

    private JPanel pnlPrincipal;
    private JPanel JPBody;

    private JPanel JP_dni;
    private JTextField JTF_dni;

    private JPanel JP_contrasenia;
    private JTextField JTF_contrasenia;

    private JPanel JP_nombre;
    private JTextField JTF_nombre;

    private JPanel JP_email;
    private JTextField JTF_email;

    private JPanel JP_domicilio;
    private JTextField JTF_domicilio;

    private JPanel JP_nacimiento;
    private JTextField JTF_nacimiento;

    private JPanel JP_cargo;
    private JComboBox JCBx_cargo;

    private JPanel JPFooter;
    private JButton guardarButton1;

    public FrmUsuarioCrear(Window owner, String titulo){

        super(owner,"Crear Usuario");

        this.setContentPane(pnlPrincipal);
        this.setSize(400,400);
        this.setModal(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);


        JTF_dni.setBackground(Color.getHSBColor(0,17,100));
        JTF_contrasenia.getText();
        JTF_nombre.getText();
        JTF_email.getText();
        JTF_domicilio.getText();
        JTF_nacimiento.getText();
        JCBx_cargo.getSelectedItem();


        guardarButton1.setEnabled(false);


        guardarButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                UsuarioController usuarioController = UsuarioController.getInstance();

                String dni, contrasenia, nombre, email, domicilio, fechaDeNacimiento;
                CargoEnumerate cargo;

                campos = [dni,]

                dni = JTF_dni.getText();
                contrasenia = JTF_contrasenia.getText();
                nombre = JTF_nombre.getText();
                email= JTF_email.getText();
                domicilio= JTF_domicilio.getText();
                fechaDeNacimiento = JTF_nacimiento.getText();
                cargo = usuarioController.textoACargo(JCBx_cargo.getSelectedItem().toString());



                UsuarioDTO usuarioDTO = new UsuarioDTO(
                        dni,
                        contrasenia,
                        email,
                        nombre,
                        domicilio,
                        fechaDeNacimiento,
                        cargo);

                usuarioController.altaUsuario(usuarioDTO);
            }
        });


        JTF_nacimiento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
    }
}
