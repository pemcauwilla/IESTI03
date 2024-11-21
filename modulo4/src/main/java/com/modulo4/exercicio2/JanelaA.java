package com.modulo4.exercicio2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class JanelaA {
    JanelaA(){
        //FRAME CONFIG
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,325);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 15));
        
        //SPACERS CONFIG
        JPanel spacerBegin = new JPanel();
        spacerBegin.setPreferredSize(new Dimension(5, 0));

        JPanel spacerMiddle = new JPanel();
        spacerMiddle.setPreferredSize(new Dimension(35, 0)); 

        //ADD ALl TOGETHER
        frame.add(spacerBegin);
        frame.add(createLeftPanel());
        frame.add(spacerMiddle);
        frame.add(createaRightPanel());
        frame.setVisible(true);
    }
    
    public JPanel createLeftPanel(){
        //LEFT PANEL CONFIG
        JPanel left_panel = new JPanel();
        left_panel.setPreferredSize(new Dimension(280,250));
        createLabelInput("Campo 1:", left_panel);
        createLabelInput("Campo 2:", left_panel);
        createLabelInput("Campo 3:", left_panel);
        createLabelInput("Campo 4:", left_panel);        
        JButton button = new JButton("Salvar");
        button.setPreferredSize(new Dimension(242, 120));
        left_panel.add(button);
        return left_panel;
    }

    public void createLabelInput(String text, JPanel panel){
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));
        JLabel label = new JLabel(text);
        JTextField field = new JTextField();
        field.setPreferredSize(new Dimension(180,20));
        JPanel spacer = new JPanel();
        spacer.setPreferredSize(new Dimension(280, 12)); 
        panel.add(spacer);
        panel.add(label);
        panel.add(field);
        panel.add(spacer);
    }

    public JPanel createaRightPanel(){
        //RIGHT PANEL CONFIG
        JPanel right_panel = new JPanel();
        right_panel.setPreferredSize(new Dimension(350,250));
        right_panel.setLayout(new BorderLayout(10,5));
        
        JLabel title = new JLabel("Título", SwingConstants.CENTER);
        Border borda = BorderFactory.createLineBorder(Color.BLACK, 1);
        title.setPreferredSize(new Dimension(200,20));
        title.setBorder(borda);
        
        JLabel rodape = new JLabel("Rodapé", SwingConstants.CENTER);
        rodape.setPreferredSize(new Dimension(200,20));
        rodape.setBorder(borda);

        JTextArea lorem = new JTextArea();
        lorem.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        lorem.setLineWrap(true);
        lorem.setEditable(false);
        lorem.setWrapStyleWord(true);
        lorem.setBackground(new Color(0, 0, 0, 0));
        lorem.setBorder(borda);

        ImageIcon imagemEsquerda = new ImageIcon("src\\OIP.jpg");
        Image imagemRedimensionada = imagemEsquerda.getImage().getScaledInstance(80, 250, Image.SCALE_SMOOTH);
        imagemEsquerda = new ImageIcon(imagemRedimensionada);
        JLabel imagemLabelEsquerda = new JLabel(imagemEsquerda);
        
        ImageIcon imagemDireita = new ImageIcon("src\\OIP.jpg");
        Image imagemDirRedimensionada = imagemDireita.getImage().getScaledInstance(80, 250, Image.SCALE_SMOOTH);
        imagemEsquerda = new ImageIcon(imagemDirRedimensionada);
        JLabel imagemLabelDireita = new JLabel(imagemEsquerda);

        //ADICIONA
        right_panel.add(title, BorderLayout.NORTH);
        right_panel.add(rodape, BorderLayout.SOUTH);
        right_panel.add(lorem, BorderLayout.CENTER);
        right_panel.add(imagemLabelEsquerda, BorderLayout.WEST);
        right_panel.add(imagemLabelDireita, BorderLayout.EAST);

        return right_panel;
    }

   
}
