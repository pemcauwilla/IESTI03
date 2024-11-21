package com.modulo4.exercicio1;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaB extends JFrame{
    public JanelaB(){
        setTitle("Janela B");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLayout(new BorderLayout());
        add(new JButton("Botão 1"), BorderLayout.NORTH);
        add(new JButton("Botão 2"), BorderLayout.CENTER);
        add(new JButton("Botão 3"), BorderLayout.WEST);
        add(new JButton("Botão 4"), BorderLayout.SOUTH);
        add(new JButton("Botão 5"), BorderLayout.EAST);
        setVisible(true);
    }
}
