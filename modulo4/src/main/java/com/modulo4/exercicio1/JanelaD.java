package com.modulo4.exercicio1;

import java.awt.Component;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaD extends JFrame{
    public JanelaD(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Janela D");
        setSize(400,450);
        addComponents(this.getContentPane());
        setVisible(true);
    }

    public void addComponents(Container pane){
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        addAButton("Botão 1", pane);
        addAButton("Botão 2", pane);
        addAButton("Botão 3", pane);
        addAButton("Botão 4", pane);
        addAButton("Botão 5", pane);
    }

    public void addAButton(String text, Container container){
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
    }
}
