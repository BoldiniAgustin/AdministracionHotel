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
    protected int total;
    protected JButton btnServicio = new JButton("<html>Servicio a<br />habitacion*</html>");
    protected JLabel lblTotal = new JLabel("");
    protected int gaseosa = 0;
    protected int tostado = 0;
    protected int cerveza = 0;
    protected int vino = 0;
    protected int snacks = 0;
    protected int licuado = 0;
    private int teatro = 0;
    private int cine = 0;
    private int cena = 0;
    private int almuerzo = 0;
    private int desayuno = 0;
    private int pileta = 0;
    private int spa = 0;

    public Servicios() {
        //Objects
        ganancia = new Ganancia();
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

        JButton btnPileta = new JButton("<html>Pileta climatizada<br />U$D " + ganancia.getPileta() + "</html>");
        btnPileta.setBounds(605, 135, 180, 90);
        btnPileta.setBackground(Color.black);
        btnPileta.setForeground(Color.white);

        JButton btnSpa = new JButton("SPA: U$D " + ganancia.getSpa());
        btnSpa.setBounds(605, 240, 180, 90);
        btnSpa.setBackground(Color.black);
        btnSpa.setForeground(Color.white);

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

        lblTotal.setBounds(200, 30, 400, 90);
        lblTotal.setText("Total: " + total);

        //Funciones
        btnTeatro.addActionListener((e) -> {
            registro("Teatro: U$D " + ganancia.getTeatro() + "\n", areaFeed);
            total = total + ganancia.getTeatro();
            lblTotal.setText("Total:" + total);
            teatro += 1;
        });

        btnAlmuerzo.addActionListener((e) -> {
            registro("Almuerzo: U$D " + ganancia.getAlmuerzo() + "\n", areaFeed);
            total = total + ganancia.getAlmuerzo();
            lblTotal.setText("Total:" + total);
            almuerzo += 1;
        });

        btnCena.addActionListener((e) -> {
            registro("Cena: U$D " + ganancia.getCena() + "\n", areaFeed);
            total = total + ganancia.getCena();
            lblTotal.setText("Total:" + total);
            cena += 1;
        });

        btnCine.addActionListener((e) -> {
            registro("Cine: U$D " + +ganancia.getCine() + "\n", areaFeed);
            total = total + ganancia.getCine();
            lblTotal.setText("Total:" + total);
            cine += 1;
        });

        btnDesayuno.addActionListener((e) -> {
            registro("Desayuno: U$D " + ganancia.getDesayuno() + "\n", areaFeed);
            total = total + ganancia.getDesayuno();
            lblTotal.setText("Total:" + total);
            desayuno += 1;
        });

        btnPileta.addActionListener((e) -> {
            registro("Pileta: U$D " + ganancia.getPileta() + "\n", areaFeed);
            total = total + ganancia.getPileta();
            lblTotal.setText("Total:" + total);
            pileta += 1;
        });

        btnSpa.addActionListener((e) -> {
            registro("Spa: U$D " + ganancia.getSpa() + "\n", areaFeed);
            total = total + ganancia.getSpa();
            lblTotal.setText("Total:" + total);
            spa += 1;
        });

        btnCancelar.addActionListener((e) -> {
            gaseosa = 0;
            tostado = 0;
            cerveza = 0;
            vino = 0;
            snacks = 0;
            licuado = 0;
            teatro = 0;
            cine = 0;
            cena = 0;
            almuerzo = 0;
            desayuno = 0;
            pileta = 0;
            spa = 0;
            total = 0;
            lblTotal.setText("Total:" + total);
            areaFeed.setText("");
        });
        
        btnAceptar.addActionListener((e) -> {
            ganancia.setCantGaseosa(gaseosa);
            ganancia.setCantTostado(tostado);
            ganancia.setCantCerveza(cerveza);
            ganancia.setCantVino(vino);
            ganancia.setCantSnacks(snacks);
            ganancia.setCantLicuado(licuado);
            ganancia.setCantTeatro(teatro);
            ganancia.setCantCine(cine);
            ganancia.setCantCena(cena);
            ganancia.setCantAlmuerzo(almuerzo);
            ganancia.setCantDesayuno(desayuno);
            ganancia.setCantPileta(pileta);
            ganancia.setCantSpa(spa);
            gaseosa = 0;
            tostado = 0;
            cerveza = 0;
            vino = 0;
            snacks = 0;
            licuado = 0;
            teatro = 0;
            cine = 0;
            cena = 0;
            almuerzo = 0;
            desayuno = 0;
            pileta = 0;
            spa = 0;
            total = 0;
            lblTotal.setText("Total:" + total);
            areaFeed.setText("");
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

    public JTextArea getAreaFeed() {
        return areaFeed;
    }

    public void setAreaFeed(JTextArea areaFeed) {
        this.areaFeed = areaFeed;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void registro(String texto, JTextArea areaFeed) {
        areaFeed.setText(areaFeed.getText() + texto);
    }
}
