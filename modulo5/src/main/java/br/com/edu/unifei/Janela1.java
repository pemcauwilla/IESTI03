package br.com.edu.unifei;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela1 extends JFrame{

    JButton createButton(String texto, Color cor, JPanel colorPanel){
        JButton button = new JButton(texto);
        button.setBorder(BorderFactory.createLineBorder(cor));
        button.setPreferredSize(new Dimension(texto.length()*10, 20));
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(cor);
            }
        });

        return button;
    }

    public Janela1(){
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(350,500);
        setLayout(new FlowLayout());
        setResizable(false);

        JPanel colorPanel = new JPanel();
        colorPanel.setBackground(Color.YELLOW);
        colorPanel.setPreferredSize(new Dimension(getWidth(), getHeight()));

        JPanel buttonPanel =new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT, getWidth()/4, 0));

        buttonPanel.add(createButton("Amarelo", Color.YELLOW, colorPanel));
        buttonPanel.add(createButton("Verde", Color.GREEN, colorPanel));
        buttonPanel.add(createButton("Azul", Color.BLUE, colorPanel));
        add(buttonPanel);
        add(colorPanel);

        setVisible(true);
    }

}
