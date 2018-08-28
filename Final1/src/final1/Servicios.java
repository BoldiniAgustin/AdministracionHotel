/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Servicios {
    protected Ganancia ganancia;
    protected JTextArea areaFeed;

    public Servicios() {
        //Objects
        ganancia=new Ganancia();
        Font negrita = new Font("Arial", Font.BOLD, 18);
        Border blackline = BorderFactory.createLineBorder(Color.black);

        JFrame frame = new JFrame("Cliente");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.gray);

        JButton btnTeatro = new JButton("Teatro: U$D " + ganancia.getTeatro());
        btnTeatro.setBounds(15, 30, 180, 90);
        btnTeatro.setBackground(Color.black);
        btnTeatro.setForeground(Color.white);

        JButton btnCine = new JButton("Cine: U$D " + ganancia.getCine());
        btnCine.setBounds(15, 135, 180, 90);
        btnCine.setBackground(Color.black);
        btnCine.setForeground(Color.white);

        JButton btnCena = new JButton("<html>Cena libre<br />U$D " + ganancia.getCena() + "</html>");
        btnCena.setBounds(15, 240, 180, 90);
        btnCena.setBackground(Color.black);
        btnCena.setForeground(Color.white);

        JButton btnAlmuerzo = new JButton("<html>Almuerzo libre<br />U$D " + ganancia.getAlmuerzo() + "</html>");
        btnAlmuerzo.setBounds(15, 345, 180, 90);
        btnAlmuerzo.setBackground(Color.black);
        btnAlmuerzo.setForeground(Color.white);

        JButton btnDesayuno = new JButton("<html>Desayudo libre<br />U$D " + ganancia.getDesayuno() + "</html>");
        btnDesayuno.setBounds(605, 30, 180, 90);
        btnDesayuno.setBackground(Color.black);
        btnDesayuno.setForeground(Color.white);

        JButton btnPileta = new JButton("<html>Pileta climatizada<br />U$D "+ ganancia.getPileta() + "</html>");
        btnPileta.setBounds(605, 135, 180, 90);
        btnPileta.setBackground(Color.black);
        btnPileta.setForeground(Color.white);

        JButton btnSpa = new JButton("SPA: U$D " + ganancia.getSpa());
        btnSpa.setBounds(605, 240, 180, 90);
        btnSpa.setBackground(Color.black);
        btnSpa.setForeground(Color.white);

        JButton btnServicio = new JButton("<html>Servicio a<br />habitacion*</html>");
        btnServicio.setBounds(605, 345, 180, 90);
        btnServicio.setBackground(Color.black);
        btnServicio.setForeground(Color.white);

        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(15, 450, 380, 45);
        btnAceptar.setBackground(Color.black);
        btnAceptar.setForeground(Color.white);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(405, 450, 380, 45);
        btnCancelar.setBackground(Color.black);
        btnCancelar.setForeground(Color.white);

        areaFeed = new JTextArea();
        areaFeed.setBounds(200, 136, 400, 300);
        areaFeed.setBorder(blackline);
        areaFeed.setEditable(false);

        JLabel lblTotal = new JLabel("Franco haz tu magia xdd");
        lblTotal.setBounds(200, 30, 400, 90);

        //Funciones
        btnTeatro.addActionListener((e) -> {
            registro("Teatro: U$D " + ganancia.getTeatro()+ "\n", areaFeed);
        });
        
        btnAlmuerzo.addActionListener((e) -> {
            registro("Almuerzo: U$D " + ganancia.getAlmuerzo()+ "\n", areaFeed);
        });
        
        btnCena.addActionListener((e) -> {
            registro("Cena: U$D " + ganancia.getCena()+ "\n", areaFeed);
        });
        
        btnCine.addActionListener((e) -> {
            registro("Cine: U$D " + + ganancia.getCine()+ "\n", areaFeed);
        });
        
        btnDesayuno.addActionListener((e) -> {
            registro("Desayuno: U$D " + ganancia.getDesayuno()+ "\n", areaFeed);
        });
        
        btnPileta.addActionListener((e) -> {
            registro("Pileta: U$D " + ganancia.getPileta()+ "\n", areaFeed);
        });
        
        btnSpa.addActionListener((e) -> {
            registro("Spa: U$D " + ganancia.getSpa() + "\n", areaFeed);
        });
        
        btnServicio.addActionListener((e) -> {
            SubServicios serv = new SubServicios();
        });
        
        
        
        
        frame.add(lblTotal);
        frame.add(areaFeed);
        frame.add(btnTeatro);
        frame.add(btnCine);
        frame.add(btnCena);
        frame.add(btnAlmuerzo);
        frame.add(btnDesayuno);
        frame.add(btnPileta);
        frame.add(btnSpa);
        frame.add(btnServicio);
        frame.add(btnAceptar);
        frame.add(btnCancelar);
        frame.setVisible(true);
    }

    public Ganancia getGanancia() {
        return ganancia;
    }

    public void setGanancia(Ganancia ganancia) {
        this.ganancia = ganancia;
    }
    
    public void registro(String texto, JTextArea areaFeed){
        areaFeed.setText(areaFeed.getText()+texto);
    }
}
