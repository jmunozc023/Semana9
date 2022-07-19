package com.mycompany.ejercicio1;
import javax.swing.*;
import java.awt.event.*;
public class Ejercicio1 extends JFrame implements ActionListener{
    private JScrollPane scrollpanel;
    private JTextArea textarea1;
    private JButton boton1;
    public Ejercicio1(){
        setLayout(null);
        textarea1=new JTextArea();
        scrollpanel=new JScrollPane(textarea1);
        scrollpanel.setBounds(10, 10, 300, 200);
        add(scrollpanel);
        boton1=new JButton("Verificar");
        boton1.setBounds(10, 260, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1){
            String texto=textarea1.getText();
            if (texto.indexOf("argentina")==-1){
                setTitle("No contiene el texto \"argentina\"");
            } else {
                setTitle("Si contiene el texto \"argentina\"");
            }
        }
    }
    public static void main(String[] args) {
        Ejercicio1 formulario1=new Ejercicio1();
        formulario1.setBounds(0, 0, 400, 380);
        formulario1.setVisible(true);
    }

    
}
