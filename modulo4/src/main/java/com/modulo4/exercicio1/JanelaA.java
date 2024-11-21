package com.modulo4.exercicio1;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaA extends JFrame{
    public JanelaA(){
        setTitle("Janela A");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLayout(new FlowLayout());
        add(new JButton("Um"));
        add(new JButton("Dois"));
        add(new JButton("Três"));
        add(new JButton("Quatro"));
        setVisible(true);
    }
}
