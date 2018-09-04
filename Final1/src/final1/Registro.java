package final1;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Registro {
    private Hashmap grupo;

    public Registro() {
        grupo = new Hashmap();
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
        cmbBxAdd.addItem("");

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
        cmbBxAdd.addActionListener((e) -> {
            System.out.println(cmbBxAdd.getSelectedItem());
            if (!cmbBxAdd.getSelectedItem().equals("")) {
                fldNombre.setText(personas.get(cmbBxAdd.getSelectedIndex()-1).getNombre());
                fldNombre.setEditable(false);
                fldDni.setText(personas.get(cmbBxAdd.getSelectedIndex()-1).getDni());
                fldDni.setEditable(false);
                fldNacionalidad.setText(personas.get(cmbBxAdd.getSelectedIndex()-1).getNacionalidad());
                fldNacionalidad.setEditable(false);
                fldDia.setText(String.valueOf(personas.get(cmbBxAdd.getSelectedIndex()-1).getNacimiento().get(Calendar.DAY_OF_MONTH)));
                fldDia.setEditable(false);
                fldMes.setText(String.valueOf(personas.get(cmbBxAdd.getSelectedIndex()-1).getNacimiento().get(Calendar.MONTH)));
                fldMes.setEditable(false);
                fldAnio.setText(String.valueOf(personas.get(cmbBxAdd.getSelectedIndex()-1).getNacimiento().get(Calendar.YEAR)));
                fldAnio.setEditable(false);
                if (personas.get(cmbBxAdd.getSelectedIndex()-1).isSexo()) {
                    cmbBxSexo.setSelectedItem("Masculino");
                }else{
                    cmbBxSexo.setSelectedItem("Femenino");
                }
                cmbBxSexo.setEditable(false);
                
            }else{
                fldNombre.setEditable(true);
                fldDni.setEditable(true);
                fldNacionalidad.setEditable(true);
                fldDia.setEditable(true);
                fldMes.setEditable(true);
                fldAnio.setEditable(true);
                vaciar(fldNombre, fldGrupo,fldNacionalidad, fldAnio,  fldDia, fldDni, fldMes);
                cmbBxSexo.setEditable(true);
            }
        });
        
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
            vaciar(fldNombre, fldGrupo,fldNacionalidad, fldAnio,  fldDia, fldDni, fldMes);
        });

        btnAnadir.addActionListener((e) -> {
                Calendar nacimiento = Calendar.getInstance();
                nacimiento.set(Integer.parseInt(fldAnio.getText()), Integer.parseInt(fldMes.getText()),Integer.parseInt(fldDia.getText()));
                Cliente c = new Cliente(fldNombre.getText(), fldDni.getText(), fldNacionalidad.getText(), nacimiento, "Masculino".equals(cmbBxSexo.getSelectedItem()));
                personas.add(c);
                c.setGrupo(fldGrupo.getText());
                cmbBxAdd.addItem(c.getNombre());
                fldGrupo.setEditable(false);
                vaciar(fldNombre, fldGrupo,fldNacionalidad, fldAnio,  fldDia, fldDni, fldMes);
        });
        
        btnConfirmar.addActionListener((e) -> {
            System.out.println(personas);
            System.out.println(fldGrupo.getText());
            List <Cliente> persona = new ArrayList();
            for (int i = 0; i < personas.size(); i++) {
                persona.add(personas.get(i));
            }
            grupo.getGrupo().put(fldGrupo.getText(), persona);
            fldGrupo.setEditable(true);
            vaciar(fldNombre, fldGrupo,fldNacionalidad, fldAnio,  fldDia, fldDni, fldMes);
            personas.clear();
            for (int i = cmbBxAdd.getItemCount()-1; i > 0; i--) {
                cmbBxAdd.removeItemAt(i);
            }
            
        });

        btnBorrar.addActionListener((e) -> {
            if (!cmbBxAdd.getSelectedItem().equals("")) {
            personas.remove(cmbBxAdd.getSelectedIndex()-1);
            cmbBxAdd.removeItem(cmbBxAdd.getSelectedItem());
            }
            
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
    
    public void vaciar(JTextField fldNombre, JTextField fldGrupo, JTextField fldNacionalidad, JTextField fldAnio, JTextField fldDia, JTextField fldDni, JTextField fldMes){
        fldNombre.setText("");
            if (fldGrupo.isEditable()) {
                fldGrupo.setText("");
            }
            fldNacionalidad.setText("");
            fldAnio.setText("");
            fldDia.setText("");
            fldDni.setText("");
            fldMes.setText("");
    }
}
