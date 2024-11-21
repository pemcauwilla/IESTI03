package com.modulo4.exercicio2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class JanelaB {
    
    Border borda = BorderFactory.createLineBorder(Color.BLACK, 1);
    Border borda2 = BorderFactory.createLineBorder(Color.BLACK, 2);
    
    JanelaB() {
        JFrame frame = new JFrame();
        frame.setSize(800,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel title = new JLabel("Título", SwingConstants.CENTER);
        title.setBorder(borda);
        title.setFont(new Font("Arial", Font.PLAIN, 18));
        title.setPreferredSize(new Dimension(800,40));

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2,2)); // Layout para 4 subpainéis

        JLabel rodape = new JLabel("Rodapé", SwingConstants.CENTER);
        rodape.setBorder(borda2);
        rodape.setFont(new Font("Arial", Font.PLAIN, 18));
        rodape.setPreferredSize(new Dimension(800,40));

        centerPanel.add(painelDefault());
        centerPanel.add(painelDefault());
        centerPanel.add(painelDefault());
        centerPanel.add(painelDefault());

        frame.add(title, BorderLayout.NORTH);
        frame.add(createLeftPanel(), BorderLayout.WEST);
        frame.add(createRightPanel(), BorderLayout.EAST);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(rodape, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    public JPanel createLeftPanel(){

        JLabel cliente = new JLabel("Cliente");
        cliente.setFont(new Font("Arial", Font.PLAIN, 18));
        JLabel Produto = new JLabel("Produto");
        Produto.setFont(new Font("Arial", Font.PLAIN, 18));
        JLabel Vendas = new JLabel("Vendas");
        Vendas.setFont(new Font("Arial", Font.PLAIN, 18));
        JLabel arquivo = new JLabel("Arquivos");
        arquivo.setFont(new Font("Arial", Font.PLAIN, 18));

        JPanel leftPanel = new JPanel();
        leftPanel.setPreferredSize(new Dimension(100,500));
        leftPanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,0));
        leftPanel.add(cliente);
        leftPanel.add(Produto);
        leftPanel.add(Vendas);
        leftPanel.add(arquivo);
        leftPanel.setBorder(borda);

        return leftPanel;
    }

    public JPanel createRightPanel(){
        JPanel rightPanel = new JPanel();
        rightPanel.setPreferredSize(new Dimension(100,500));
        rightPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        rightPanel.setBorder(borda);
        JTextArea areaDireita = new JTextArea();
        areaDireita.setPreferredSize(new Dimension(80, 500));
        areaDireita.setFont(new Font("Arial", Font.PLAIN, 18));
        areaDireita.setText("Área das propagandas");
        areaDireita.setLineWrap(true);
        areaDireita.setEditable(false);
        areaDireita.setWrapStyleWord(true);
        areaDireita.setBackground(new Color(0, 0, 0, 0));
        rightPanel.add(areaDireita);
        return rightPanel;
    }

     public JPanel painelDefault() {
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); 
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1)); 
    
        Border topAndBottomBorder = BorderFactory.createMatteBorder(1, 0, 1, 0, Color.BLACK); 
        Border topAndBottomBorder2 = BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK); 
        
        JLabel title = new JLabel("Título", SwingConstants.CENTER);
        title.setBorder(topAndBottomBorder);  
        title.setFont(new Font("Arial", Font.PLAIN, 18));
        title.setAlignmentX(Component.LEFT_ALIGNMENT); 
        title.setPreferredSize(new Dimension(600, 40)); 
        title.setMaximumSize(new Dimension(Short.MAX_VALUE, 40)); 
    
        JLabel postagem = new JLabel("Postagem", SwingConstants.CENTER);
        postagem.setBorder(topAndBottomBorder);  
        postagem.setFont(new Font("Arial", Font.PLAIN, 18));
        postagem.setAlignmentX(Component.LEFT_ALIGNMENT); 
        postagem.setPreferredSize(new Dimension(600, 100)); 
        postagem.setMaximumSize(new Dimension(Short.MAX_VALUE, 100)); 
    
        JLabel autor = new JLabel("Autor", SwingConstants.CENTER);
        autor.setBorder(topAndBottomBorder2);  
        autor.setFont(new Font("Arial", Font.PLAIN, 18));
        autor.setAlignmentX(Component.LEFT_ALIGNMENT); 
        autor.setPreferredSize(new Dimension(600, 40)); 
        autor.setMaximumSize(new Dimension(Short.MAX_VALUE, 40)); 

        panel.add(Box.createRigidArea(new Dimension(0, 5))); 
        panel.add(title);
        panel.add(Box.createRigidArea(new Dimension(0, 5))); 
        panel.add(postagem);
        panel.add(Box.createRigidArea(new Dimension(0, 5))); 
        panel.add(autor);
    
        return panel;
    }
}
