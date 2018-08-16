package graficaregistrocliente;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class GraficaRegistroCliente {

    public static void main(String[] args) {
        ClienteInterfaz registro = new ClienteInterfaz();
    }
    
    public GraficaRegistroCliente(){

        Font negrita = new Font("Arial", Font.BOLD, 18);

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


        JLabel lblGrupo = new JLabel("Grupo");
        lblGrupo.setBounds(15, 30, 200, 20);
        lblGrupo.setForeground(Color.black);
        
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
        
        
        JLabel lblSexo = new JLabel("Sexo");
        lblSexo.setBounds(15, 280, 150, 20);
        lblSexo.setForeground(Color.black);
        
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
        
        JLabel lblAdd = new JLabel("Gente a añadir");
        lblAdd.setBounds(550, 10, 200, 20);
        lblAdd.setFont(negrita);
        lblAdd.setForeground(Color.black);
        
        JComboBox comboBoxAdd = new JComboBox();
        comboBoxAdd.setBounds(520, 50, 200, 20);
        
        
        
        
        JButton btnAñadir = new JButton("Añadir");
        btnAñadir.setBounds(210, 250, 100, 70);
        btnAñadir.setMnemonic(0);
        btnAñadir.addActionListener((e)->{
            comboBoxAdd.addItem(fieldNombre.getText());
            fieldNombre.setText("");
            fieldGrupo.setText("");
            fieldNacionalidad.setText("");
            fieldAnio.setText("");
            fieldDia.setText("");
            fieldDni.setText("");
            fieldMes.setText("");
        });
        
        JButton btnBorrar = new JButton("Borrar Integrante");
        btnBorrar.setBounds(520, 250, 200, 30);
        btnBorrar.addActionListener((e) -> {
            comboBoxAdd.removeItem(comboBoxAdd.getSelectedItem());
        });
        
        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setBounds(520, 300, 200, 30);
        
        
        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(320, 250, 100, 70);
        btnLimpiar.addActionListener((e)->{
            fieldNombre.setText("");
            fieldGrupo.setText("");
            fieldNacionalidad.setText("");
            fieldAnio.setText("");
            fieldDia.setText("");
            fieldDni.setText("");
            fieldMes.setText("");
        });
        
        frame.add(btnConfirmar);
        frame.add(btnBorrar);
        frame.add(lblAdd);
        frame.add(comboBoxAdd);
        frame.add(btnLimpiar);
        frame.add(btnAñadir);
        frame.add(labelNacimiento);
        frame.add(fieldDia);
        frame.add(lbl1);
        frame.add(fieldMes);
        frame.add(lbl2);
        frame.add(fieldAnio);
        frame.add(lblGrupo);
        frame.add(fieldGrupo);
        frame.add(lblSexo);
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
