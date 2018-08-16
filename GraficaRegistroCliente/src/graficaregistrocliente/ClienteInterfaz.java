package graficaregistrocliente;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class ClienteInterfaz {

    public ClienteInterfaz() {
        Font negrita = new Font("Arial", Font.BOLD, 18);
        Border blackline = BorderFactory.createLineBorder(Color.black);

        JFrame frame = new JFrame("Cliente");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.gray);

        JButton btnUno = new JButton("Btn 1");
        btnUno.setBounds(15, 30, 180, 90);
        btnUno.setBackground(Color.black);
        btnUno.setForeground(Color.white);

        JButton btnDos = new JButton("Btn 2");
        btnDos.setBounds(15, 135, 180, 90);
        btnDos.setBackground(Color.black);
        btnDos.setForeground(Color.white);

        JButton btnTres = new JButton("Btn 3");
        btnTres.setBounds(15, 240, 180, 90);
        btnTres.setBackground(Color.black);
        btnTres.setForeground(Color.white);

        JButton btnCuatro = new JButton("Btn 4");
        btnCuatro.setBounds(15, 345, 180, 90);
        btnCuatro.setBackground(Color.black);
        btnCuatro.setForeground(Color.white);

        JButton btnCinco = new JButton("Btn 5");
        btnCinco.setBounds(605, 30, 180, 90);
        btnCinco.setBackground(Color.black);
        btnCinco.setForeground(Color.white);

        JButton btnSeis = new JButton("Btn 6");
        btnSeis.setBounds(605, 135, 180, 90);
        btnSeis.setBackground(Color.black);
        btnSeis.setForeground(Color.white);

        JButton btnSiete = new JButton("Btn 7");
        btnSiete.setBounds(605, 240, 180, 90);
        btnSiete.setBackground(Color.black);
        btnSiete.setForeground(Color.white);

        JButton btnOcho = new JButton("Btn 8");
        btnOcho.setBounds(605, 345, 180, 90);
        btnOcho.setBackground(Color.black);
        btnOcho.setForeground(Color.white);
        
        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(15, 450, 380, 45);
        btnAceptar.setBackground(Color.black);
        btnAceptar.setForeground(Color.white);
        
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(405, 450, 380, 45);
        btnCancelar.setBackground(Color.black);
        btnCancelar.setForeground(Color.white);
        
        JTextArea areaFeed = new JTextArea();
        areaFeed.setBounds(200, 136, 400, 300);
        areaFeed.setBorder(blackline);
        
        JLabel lblTotal = new JLabel("Franco haz tu magia xdd");
        lblTotal.setBounds(200, 30, 400, 90);
        
        
        
        frame.add(lblTotal);
        frame.add(areaFeed);
        frame.add(btnUno);
        frame.add(btnDos);
        frame.add(btnTres);
        frame.add(btnCuatro);
        frame.add(btnCinco);
        frame.add(btnSeis);
        frame.add(btnSiete);
        frame.add(btnOcho);
        frame.add(btnAceptar);
        frame.add(btnCancelar);
        frame.setVisible(true);
    }
}
