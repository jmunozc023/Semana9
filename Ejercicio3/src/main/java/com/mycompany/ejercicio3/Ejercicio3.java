package com.mycompany.ejercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ejercicio3 extends JFrame implements ActionListener {
    private JLabel label1,label2,label3;
    private JComboBox combo1,combo2,combo3;
    private JButton boton1;
    public Ejercicio3(){
        setLayout(null);
        label1=new JLabel("Rojo");
        label1.setBounds(10, 10, 100, 30);
        add(label1);
        combo1=new JComboBox();
        combo1.setBounds(120, 10, 50, 30);
        for (int f=0;f<=255;f++){
            combo1.addItem(String.valueOf(f));
        }
        add(combo1);
        label2=new JLabel("Verde");
        label2.setBounds(10, 50, 100, 30);
        add(label2);
        combo2=new JComboBox();
        combo2.setBounds(120, 50, 50, 30);
        for (int f=0;f<=255;f++){
            combo2.addItem(String.valueOf(f));
        }
        add(combo2);
        label3=new JLabel("Azul");
        label3.setBounds(10, 90, 100, 30);
        add(label3);
        combo3=new JComboBox();
        combo3.setBounds(120, 90, 50, 30);
        for (int f=0;f<=255;f++){
            combo3.addItem(String.valueOf(f));
        }
        add(combo3);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static void main(String[] args) {
        
    }

    
}
