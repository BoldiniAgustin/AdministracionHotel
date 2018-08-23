package graficaregistrocliente;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class ServHabitacion {
    
    public ServHabitacion() {
        Font negrita = new Font("Arial", Font.BOLD, 18);
        Border blackline = BorderFactory.createLineBorder(Color.black);

        JFrame frame = new JFrame("Cliente");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 170);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.gray);
        
        JLabel lblTotal = new JLabel("Servicios");
        lblTotal.setBounds(175, 15, 200, 20);
        lblTotal.setFont(negrita);
        
        JButton btnUno = new JButton("Gaseosa: U$D 2");
        btnUno.setBounds(15, 40, 150, 50);
        btnUno.setBackground(Color.black);
        btnUno.setForeground(Color.white);

        JButton btnDos = new JButton("Tostado: U$D 3");
        btnDos.setBounds(15, 100, 150, 50);
        btnDos.setBackground(Color.black);
        btnDos.setForeground(Color.white);

        JButton btnTres = new JButton("Cerveza: U$D 5");
        btnTres.setBounds(175, 40, 150, 50);
        btnTres.setBackground(Color.black);
        btnTres.setForeground(Color.white);

        JButton btnCuatro = new JButton("Vino: U$D 10");
        btnCuatro.setBounds(175, 100, 150, 50);
        btnCuatro.setBackground(Color.black);
        btnCuatro.setForeground(Color.white);

        JButton btnCinco = new JButton("Snacks: U$D 1");
        btnCinco.setBounds(335, 40, 150, 50);
        btnCinco.setBackground(Color.black);
        btnCinco.setForeground(Color.white);

        JButton btnSeis = new JButton("Licuado: U$D 3");
        btnSeis.setBounds(335, 100, 150, 50);
        btnSeis.setBackground(Color.black);
        btnSeis.setForeground(Color.white);
        
        btnUno.addActionListener((ActionEvent e) -> {
            
        });
        
        
        frame.add(lblTotal);
        frame.add(btnUno);
        frame.add(btnDos);
        frame.add(btnTres);
        frame.add(btnCuatro);
        frame.add(btnCinco);
        frame.add(btnSeis);
        frame.setVisible(true);
    }
    
}
