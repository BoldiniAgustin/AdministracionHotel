package final1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class SubServicios extends Servicios{
    
    public SubServicios() {
        
        Font negrita = new Font("Arial", Font.BOLD, 18);
        Border blackline = BorderFactory.createLineBorder(Color.black);

        JFrame frame = new JFrame("Servicios a Habitacion");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.gray);
        
        JLabel lblServicio = new JLabel("Servicios");
        lblServicio.setBounds(175, 15, 200, 20);
        lblServicio.setFont(negrita);
        
        JButton btnGaseosa = new JButton("Gaseosa: U$D " + ganancia.getGaseosa());
        btnGaseosa.setBounds(15, 40, 150, 50);
        btnGaseosa.setBackground(Color.black);
        btnGaseosa.setForeground(Color.white);

        JButton btnTostado = new JButton("Tostado: U$D " + ganancia.getTostado());
        btnTostado.setBounds(15, 100, 150, 50);
        btnTostado.setBackground(Color.black);
        btnTostado.setForeground(Color.white);

        JButton btnCerveza = new JButton("Cerveza: U$D " + ganancia.getCerveza());
        btnCerveza.setBounds(175, 40, 150, 50);
        btnCerveza.setBackground(Color.black);
        btnCerveza.setForeground(Color.white);

        JButton btnVino = new JButton("Vino: U$D " + ganancia.getVino());
        btnVino.setBounds(175, 100, 150, 50);
        btnVino.setBackground(Color.black);
        btnVino.setForeground(Color.white);

        JButton btnSnacks = new JButton("Snacks: U$D " + ganancia.getSnacks());
        btnSnacks.setBounds(335, 40, 150, 50);
        btnSnacks.setBackground(Color.black);
        btnSnacks.setForeground(Color.white);

        JButton btnLicuado = new JButton("Licuado: U$D " + ganancia.getLicuado());
        btnLicuado.setBounds(335, 100, 150, 50);
        btnLicuado.setBackground(Color.black);
        btnLicuado.setForeground(Color.white);
        
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(15, 160, 470, 30);
        btnCancelar.setBackground(Color.black);
        btnCancelar.setForeground(Color.white);
        
        //Funciones
        
        btnGaseosa.addActionListener((ActionEvent e) -> {
            registro("Gaseosa: U$D " + ganancia.getGaseosa()+ "\n", areaFeed);
            total= total + ganancia.getGaseosa();
            lblTotal.setText("Total:" + total);
            gaseosa += 1;
            frame.setVisible(false);
        });
        
        btnTostado.addActionListener((ActionEvent e) -> {
            registro("Tostado: U$D " + ganancia.getTostado()+ "\n", areaFeed);
            total= total + ganancia.getTostado();
            lblTotal.setText("Total:" + total);
            tostado += 1;
            frame.setVisible(false);
        });
        
        btnCerveza.addActionListener((ActionEvent e) -> {
            registro("Cerveza: U$D " + ganancia.getCerveza()+ "\n", areaFeed);
            total= total + ganancia.getCerveza();
            lblTotal.setText("Total:" + total);
            cerveza += 1;
            frame.setVisible(false);
        });
        
        btnVino.addActionListener((ActionEvent e) -> {
            registro("Vino: U$D " + ganancia.getVino()+ "\n", areaFeed);
            total= total + ganancia.getVino();
            lblTotal.setText("Total:" + total);
            vino += 1;
            frame.setVisible(false);
        });
        
        btnSnacks.addActionListener((ActionEvent e) -> {
            registro("Snacks: U$D " + ganancia.getSnacks()+ "\n", areaFeed);
            total= total + ganancia.getSnacks();
            lblTotal.setText("Total:" + total);
            snacks += 1;
            frame.setVisible(false);
        });
        
        btnLicuado.addActionListener((ActionEvent e) -> {
            registro("Licuado: U$D " + ganancia.getLicuado()+ "\n", areaFeed);
            total= total + ganancia.getLicuado();
            lblTotal.setText("Total:" + total);
            licuado += 1;
            frame.setVisible(false);
        });
        
        btnCancelar.addActionListener((ActionEvent e) -> {
            frame.setVisible(false);
        });
        
        
        frame.add(btnCancelar);
        frame.add(lblServicio);
        frame.add(btnGaseosa);
        frame.add(btnTostado);
        frame.add(btnCerveza);
        frame.add(btnVino);
        frame.add(btnSnacks);
        frame.add(btnLicuado);
        frame.setVisible(false);
        
        btnServicio.addActionListener((e) -> {
            frame.setVisible(true);
        });
    }
    
}

