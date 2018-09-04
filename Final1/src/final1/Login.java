package final1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {

    private boolean verif;

    public static void main(String[] args) {
        Login login = new Login();
    }

    public Login() {

        Font negrita = new Font("Arial", Font.BOLD, 18);

        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.gray);

        JLabel lbl1 = new JLabel("Login");
        lbl1.setBounds(120, 10, 100, 20);
        lbl1.setForeground(Color.black);
        lbl1.setFont(negrita);

        JButton btnCliente = new JButton("Cliente");
        btnCliente.setBounds(10, 50, 130, 40);

        JButton btnEmpleado = new JButton("Empleado");
        btnEmpleado.setBounds(160, 50, 130, 40);

        

        JLabel lbl2 = new JLabel("Account:");
        lbl2.setBounds(25, 50, 80, 20);
        lbl2.setForeground(Color.black);
        lbl2.setVisible(false);

        JLabel lbl3 = new JLabel("Password:");
        lbl3.setBounds(25, 80, 100, 20);
        lbl3.setForeground(Color.black);
        lbl3.setVisible(false);

        JTextField fldUser = new JTextField();
        fldUser.setBounds(130, 50, 130, 20);
        fldUser.setVisible(false);

        JPasswordField fldPassword = new JPasswordField();
        fldPassword.setBounds(130, 80, 130, 20);
        fldPassword.setVisible(false);

        JButton btnLogin = new JButton("Log In");
        btnLogin.setBounds(65, 140, 150, 30);
        btnLogin.setVisible(false);

        btnEmpleado.addActionListener((ActionEvent e) -> {
            verif = false;
            campos(frame, btnEmpleado, btnCliente, lbl2, lbl3, fldUser, fldPassword, btnLogin );

        });

        btnCliente.addActionListener((ActionEvent e) -> {
            verif = true;
            campos(frame, btnEmpleado, btnCliente, lbl2, lbl3, fldUser, fldPassword, btnLogin );
        });

        btnLogin.addActionListener((ActionEvent e) -> {
           verificar(fldUser, fldPassword, frame, lbl2, lbl3);
        });
        
        fldUser.addActionListener((ActionEvent e) -> {
            fldPassword.requestFocus();
        });
        
        fldPassword.addActionListener((ActionEvent e) -> {
            verificar(fldUser, fldPassword, frame, lbl2, lbl3);
        });

        
        frame.add(btnEmpleado);
        frame.add(btnCliente);
        frame.add(btnLogin);
        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(lbl3);
        frame.add(fldUser);
        frame.add(fldPassword);
        frame.setVisible(true);
    }
    
    public void verificar(JTextField fldUser, JPasswordField fldPassword, JFrame frame, JLabel lbl2, JLabel lbl3){
         String user = fldUser.getText();
            char[] arrayC = fldPassword.getPassword();
            String pass = new String(arrayC);
            if (verif == true) {
                SubServicios serv = new SubServicios();
                frame.dispose();
            } else {
//                if ((user.equals("BlakeBelladonna") && pass.equals("gato1234")) || (user.equals("RubyRose") && pass.equals("rojoredd")) || (user.equals("WeissSchnee") && pass.equals("plata123"))) {
                    EmpleadoLogin empleado = new EmpleadoLogin();
                    frame.dispose();
//                } else {
//                    JOptionPane.showMessageDialog(null, "Contraseña o nombre de usuario no valido", "Error" ,JOptionPane.WARNING_MESSAGE);
//                }

            }
    }
    
    public void campos(JFrame frame, JButton btnEmpleado, JButton btnCliente, JLabel lbl2, JLabel lbl3, JTextField fldUser, JPasswordField fldPassword, JButton btnLogin ){
        frame.setSize(300, 200);
        btnEmpleado.setVisible(false);
        btnCliente.setVisible(false);
        lbl2.setVisible(true);
        lbl3.setVisible(true);
        fldUser.setVisible(true);
        fldPassword.setVisible(true);
        btnLogin.setVisible(true);
    }
}
