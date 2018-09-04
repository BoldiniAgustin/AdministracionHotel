/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author francobustos
 */
public class EmpleadoLogin {
    EmpleadoLogin(){
        //Objetos
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.gray);
        
        JButton btnRegistro = new JButton("Registro");
        btnRegistro.setBounds(10, 50, 130, 40);

        JButton btnCobrar = new JButton("Cobrar");
        btnCobrar.setBounds(160, 50, 130, 40);
        
        
        
        //Acciones
        btnRegistro.addActionListener((ActionEvent e) -> {
            Registro registro = new Registro();
            frame.dispose();
        });

        btnCobrar.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "En mantenimiento");
        });

        frame.add(btnCobrar);
        frame.add(btnRegistro);
        frame.setVisible(true);
    }
}
