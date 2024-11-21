package com.modulo4.exercicio1;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaC extends JFrame{
    public JanelaC(){
        setTitle("Janela C");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,350);
        setLayout(new GridLayout(3,2));
        add(new JButton("Botão 1"));
        add(new JButton("Botão 2"));
        add(new JButton("Botão 3"));
        add(new JButton("Botão 4"));
        add(new JButton("Botão 5"));
        setVisible(true);
    }
}
