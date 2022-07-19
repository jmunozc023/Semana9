package com.mycompany.ejercicio2;

import java.awt.event.*;
import javax.swing.*;


public class Ejercicio2 extends JFrame implements ItemListener{
    private JComboBox combo1;
    public Ejercicio2(){
        setLayout(null);
        combo1=new JComboBox();
        combo1.setBounds(10, 10, 150, 20);
        add(combo1);
        combo1.addItem("rojo");
        combo1.addItem("verde");
        combo1.addItem("azul");
        combo1.addItem("amarillo");
        combo1.addItem("negro");
        combo1.addItemListener(this);
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource()==combo1){
            String seleccionado=(String)combo1.getSelectedItem();
            setTitle(seleccionado);
        }
    }
    public static void main(String[] args) {
        Ejercicio2 formulario1=new Ejercicio2();
        formulario1.setBounds(0, 0, 400, 200);
        formulario1.setVisible(true);
    }

    
}
