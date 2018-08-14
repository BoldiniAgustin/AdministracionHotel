package final1;

import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Final1 {

    public static void main(String[] args) {

        Final1 pestaña = new Final1();
    }

    public Final1() {
        HashMap grupo = new HashMap();
        List<Cliente> personas = new ArrayList<>();
        Font negrita = new Font("Arial", Font.BOLD, 18);

        //Objects
        JFrame frame = new JFrame("Regristo Cliente");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 350);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.gray);

        JLabel lblTitulo = new JLabel("REGISTRO CLIENTE");
        lblTitulo.setBounds(150, 10, 200, 20);
        lblTitulo.setForeground(Color.black);
        lblTitulo.setFont(negrita);

        JLabel lblGrupo = new JLabel("Grupo");
        lblGrupo.setBounds(15, 30, 200, 20);
        lblGrupo.setForeground(Color.black);

        JTextField fldGrupo = new JTextField();
        fldGrupo.setBounds(15, 50, 470, 20);

        JLabel lblNombre = new JLabel("APELLIDO, Nombre");
        lblNombre.setBounds(15, 80, 200, 20);
        lblNombre.setForeground(Color.black);

        JTextField fldNombre = new JTextField();
        fldNombre.setBounds(15, 100, 470, 20);

        JLabel lblDni = new JLabel("Documento Nacional de Identidad (DNI)");
        lblDni.setBounds(15, 130, 300, 20);
        lblDni.setForeground(Color.black);

        JTextField fldDni = new JTextField();
        fldDni.setBounds(15, 150, 470, 20);

        JLabel lblNacionalidad = new JLabel("Nacionalidad");
        lblNacionalidad.setBounds(15, 180, 150, 20);
        lblNacionalidad.setForeground(Color.black);

        JTextField fldNacionalidad = new JTextField();
        fldNacionalidad.setBounds(15, 200, 470, 20);

        JLabel lblSexo = new JLabel("Sexo");
        lblSexo.setBounds(15, 280, 150, 20);
        lblSexo.setForeground(Color.black);

        JComboBox cmbBxSexo = new JComboBox();
        cmbBxSexo.addItem("Masculino");
        cmbBxSexo.addItem("Femenino");
        cmbBxSexo.setBounds(15, 300, 170, 20);

        JLabel lblNacimiento = new JLabel("Fecha de nacimiento");
        lblNacimiento.setBounds(15, 230, 200, 20);
        lblNacimiento.setForeground(Color.black);

        JTextField fldDia = new JTextField();
        fldDia.setBounds(15, 250, 40, 20);
        JLabel lbl1 = new JLabel("/");
        lbl1.setBounds(60, 250, 10, 20);
        lbl1.setFont(negrita);
        JTextField fldMes = new JTextField();
        fldMes.setBounds(70, 250, 40, 20);
        JLabel lbl2 = new JLabel("/");
        lbl2.setFont(negrita);
        lbl2.setBounds(115, 250, 10, 20);
        JTextField fldAnio = new JTextField();
        fldAnio.setBounds(125, 250, 60, 20);

        JLabel lblAdd = new JLabel("Gente a añadir");
        lblAdd.setBounds(550, 10, 200, 20);
        lblAdd.setFont(negrita);
        lblAdd.setForeground(Color.black);

        JComboBox cmbBxAdd = new JComboBox();
        cmbBxAdd.setBounds(520, 50, 200, 20);

        JButton btnBorrar = new JButton("Borrar Integrante");
        btnBorrar.setBounds(520, 250, 200, 30);

        JButton btnAnadir = new JButton("Añadir");
        btnAnadir.setBounds(210, 250, 100, 70);
        btnAnadir.setMnemonic('A');

        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setBounds(520, 300, 200, 30);

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(320, 250, 100, 70);
        btnLimpiar.setMnemonic('L');

        //Actions
        fldGrupo.addActionListener((e) -> {
            fldNombre.requestFocus();
        });

        fldNombre.addActionListener((e) -> {
            fldDni.requestFocus();
        });

        fldDni.addActionListener((e) -> {
            fldNacionalidad.requestFocus();
        });

        fldNacionalidad.addActionListener((e) -> {
            fldDia.requestFocus();
        });

        fldDia.addActionListener((e) -> {
            fldMes.requestFocus();
        });

        fldMes.addActionListener((e) -> {
            fldAnio.requestFocus();
        });

        btnLimpiar.addActionListener((e) -> {
            fldNombre.setText("");
            fldGrupo.setText("");
            fldNacionalidad.setText("");
            fldAnio.setText("");
            fldDia.setText("");
            fldDni.setText("");
            fldMes.setText("");
        });

        btnAnadir.addActionListener((e) -> {
            try {
                String nacimientotxt = fldDia.getText() + "/" + fldMes.getText() + "/" + fldAnio.getText();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date nacimiento = sdf.parse(nacimientotxt);
                Cliente c = new Cliente(fldNombre.getText(), fldDni.getText(), fldNacionalidad.getText(), nacimiento, "Masculino".equals(cmbBxSexo.getSelectedItem()));
                personas.add(c);
                c.setGrupo(fldGrupo.getText());
            } catch (ParseException ex) {
            }
        });

        btnAnadir.addActionListener((e) -> {
            cmbBxAdd.addItem(fldNombre.getText());
            fldNombre.setText("");
            fldGrupo.setText("");
            fldNacionalidad.setText("");
            fldAnio.setText("");
            fldDia.setText("");
            fldDni.setText("");
            fldMes.setText("");
        });

        btnBorrar.addActionListener((e) -> {
            cmbBxAdd.removeItem(cmbBxAdd.getSelectedItem());
        });

        //Adds
        frame.add(btnConfirmar);
        frame.add(btnBorrar);
        frame.add(lblAdd);
        frame.add(cmbBxAdd);
        frame.add(btnLimpiar);
        frame.add(btnAnadir);
        frame.add(lblNacimiento);
        frame.add(fldDia);
        frame.add(lbl1);
        frame.add(fldMes);
        frame.add(lbl2);
        frame.add(fldAnio);
        frame.add(lblGrupo);
        frame.add(fldGrupo);
        frame.add(lblSexo);
        frame.add(cmbBxSexo);
        frame.add(lblTitulo);
        frame.add(lblNombre);
        frame.add(fldNombre);
        frame.add(lblDni);
        frame.add(fldDni);
        frame.add(lblNacionalidad);
        frame.add(fldNacionalidad);
        frame.setVisible(true);
    }
}
