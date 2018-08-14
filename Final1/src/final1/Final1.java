/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author francobustos
 */
public class Final1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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

        JLabel labelTitulo = new JLabel("REGISTRO CLIENTE");
        labelTitulo.setBounds(150, 10, 200, 20);
        labelTitulo.setForeground(Color.black);
        labelTitulo.setFont(negrita);

        JLabel labelGrupo = new JLabel("Grupo");
        labelGrupo.setBounds(15, 30, 200, 20);
        labelGrupo.setForeground(Color.black);

        JTextField fieldGrupo = new JTextField();
        fieldGrupo.setBounds(15, 50, 470, 20);

        JLabel labelNombre = new JLabel("APELLIDO, Nombre");
        labelNombre.setBounds(15, 80, 200, 20);
        labelNombre.setForeground(Color.black);

        JTextField fieldNombre = new JTextField();
        fieldNombre.setBounds(15, 100, 470, 20);

        JLabel labelDni = new JLabel("Documento Nacional de Identidad (DNI)");
        labelDni.setBounds(15, 130, 300, 20);
        labelDni.setForeground(Color.black);

        JTextField fieldDni = new JTextField();
        fieldDni.setBounds(15, 150, 470, 20);

        JLabel labelNacionalidad = new JLabel("Nacionalidad");
        labelNacionalidad.setBounds(15, 180, 150, 20);
        labelNacionalidad.setForeground(Color.black);

        JTextField fieldNacionalidad = new JTextField();
        fieldNacionalidad.setBounds(15, 200, 470, 20);

        JLabel labelSexo = new JLabel("Sexo");
        labelSexo.setBounds(15, 280, 150, 20);
        labelSexo.setForeground(Color.black);

        JComboBox comboBoxSexo = new JComboBox();
        comboBoxSexo.addItem("Masculino");
        comboBoxSexo.addItem("Femenino");
        comboBoxSexo.setBounds(15, 300, 170, 20);

        JLabel labelNacimiento = new JLabel("Fecha de nacimiento");
        labelNacimiento.setBounds(15, 230, 200, 20);
        labelNacimiento.setForeground(Color.black);

        JTextField fieldDia = new JTextField();
        fieldDia.setBounds(15, 250, 40, 20);
        JLabel lbl1 = new JLabel("/");
        lbl1.setBounds(60, 250, 10, 20);
        lbl1.setFont(negrita);
        JTextField fieldMes = new JTextField();
        fieldMes.setBounds(70, 250, 40, 20);
        JLabel lbl2 = new JLabel("/");
        lbl2.setFont(negrita);
        lbl2.setBounds(115, 250, 10, 20);
        JTextField fieldAnio = new JTextField();
        fieldAnio.setBounds(125, 250, 60, 20);

        JButton btnAnadir = new JButton("Añadir");
        btnAnadir.setBounds(210, 250, 100, 70);
        btnAnadir.setMnemonic('A');

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(320, 250, 100, 70);
        btnLimpiar.setMnemonic('L');
        
        //Actions
        fieldGrupo.addActionListener((e) -> {
            fieldNombre.requestFocus();
        });
        
        fieldNombre.addActionListener((e) -> {
            fieldDni.requestFocus();
        });
        
        fieldDni.addActionListener((e) -> {
            fieldNacionalidad.requestFocus();
        });
        
        fieldNacionalidad.addActionListener((e) -> {
            fieldDia.requestFocus();
        });
        
        fieldDia.addActionListener((e) -> {
           fieldMes.requestFocus(); 
        });
        
        fieldMes.addActionListener((e) -> {
           fieldAnio.requestFocus(); 
        });
        
        btnAnadir.addActionListener((e) -> {
            try {
                String nacimientotxt = fieldDia.getText()+"/"+fieldMes.getText()+"/"+fieldAnio.getText();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date nacimiento = sdf.parse(nacimientotxt);
                Cliente c = new Cliente(fieldNombre.getText(), fieldDni.getText(), fieldNacionalidad.getText(), nacimiento, "Masculino".equals(comboBoxSexo.getSelectedItem()));
                personas.add(c);
                c.setGrupo(fieldGrupo.getText());
            } catch (ParseException ex) {
            }
        });
        
        
        //Adds
        frame.add(btnLimpiar);
        frame.add(btnAnadir);
        frame.add(labelNacimiento);
        frame.add(fieldDia);
        frame.add(lbl1);
        frame.add(fieldMes);
        frame.add(lbl2);
        frame.add(fieldAnio);
        frame.add(labelGrupo);
        frame.add(fieldGrupo);
        frame.add(labelSexo);
        frame.add(comboBoxSexo);
        frame.add(labelTitulo);
        frame.add(labelNombre);
        frame.add(fieldNombre);
        frame.add(labelDni);
        frame.add(fieldDni);
        frame.add(labelNacionalidad);
        frame.add(fieldNacionalidad);
        frame.setVisible(true);
    }
}
