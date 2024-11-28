package br.com.edu.unifei;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Janela2 extends JFrame{

    private int rightPanelMargin = 40;

    JButton createButton(String texto, JLabel label){

        JButton button = new JButton(texto);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(texto); // 
            }
         });

         return button;
    }

    JPanel createGrid(String texto1, String texto2, int width, int height, JLabel label){

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(width,height));
        panel.setLayout(new GridLayout(2,1,0,40));
        panel.add(createButton(texto1, label));
        panel.add(createButton(texto2, label));
        panel.setBorder(BorderFactory.createEmptyBorder(0,0,0,rightPanelMargin));
        return panel;
    }


    public Janela2(){
        setLayout(new FlowLayout());
        setSize(400,500);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel label = new JLabel("Java");
        label.setBorder(BorderFactory.createEmptyBorder(0, 0, getHeight()/3, getWidth()));

        JPanel mainPanel = new JPanel();
        mainPanel.add(createGrid("Java", "C++", 65 + rightPanelMargin, 90, label));
        mainPanel.add(createGrid("JavaScript", "C#", 95 + rightPanelMargin, 90, label));
        mainPanel.add(createGrid("Python", "C", 75 + rightPanelMargin, 90, label));
           
        add(label);
        add(mainPanel);

        setVisible(true);
    }
}
