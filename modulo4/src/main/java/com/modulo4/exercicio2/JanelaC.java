package com.modulo4.exercicio2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class JanelaC {

    Border borda = BorderFactory.createLineBorder(Color.BLACK, 1);

    JanelaC() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 470);
        frame.setLayout(new BorderLayout()); 

        JPanel painelTitulo = new JPanel(new BorderLayout());
        JLabel titulo = new JLabel("Título", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.PLAIN, 18));
        titulo.setBorder(borda);
        titulo.setPreferredSize(new Dimension(800, 35)); 

        painelTitulo.add(titulo, BorderLayout.CENTER); 
        frame.add(painelTitulo, BorderLayout.NORTH); 

        JPanel painelCentral = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 30));

        painelCentral.add(createLeftPanel());
        painelCentral.add(createRightPanel());
        
        frame.add(painelCentral, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public JPanel createLeftPanel(){
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS)); 
        leftPanel.setPreferredSize(new Dimension(370, 400));

        JLabel titulo_left = new JLabel("Título do Texto");
        titulo_left.setHorizontalAlignment(SwingConstants.LEFT); 
        titulo_left.setBorder(new EmptyBorder(0, 0, 0, 80));

        JTextArea area = new JTextArea(10, 20);
        area.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
                + "Etiam eget ligula eu lectus lobortis condimentum. Aliquam nonummy auctor massa.");
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setEditable(false);

        JScrollPane scroll = new JScrollPane(area); 
        scroll.setPreferredSize(new Dimension(280, 150));

        JPanel panel_Botoes = new JPanel(new FlowLayout());
        panel_Botoes.add(new JButton("Salvar"));
        panel_Botoes.add(new JButton("Cancelar"));
        panel_Botoes.add(new JButton("Voltar"));

        leftPanel.add(titulo_left);
        leftPanel.add(Box.createVerticalStrut(10)); 
        leftPanel.add(scroll); 
        leftPanel.add(Box.createVerticalStrut(10)); 
        leftPanel.add(panel_Botoes);
        
        return leftPanel;
    }

    public JPanel createRightPanel(){
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS)); // Layout vertical
        rightPanel.setPreferredSize(new Dimension(370, 400));

        ImageIcon imagem = new ImageIcon("src\\OIP.jpg");
        Image imagemRedimensionada = imagem.getImage().getScaledInstance(380, 300, Image.SCALE_SMOOTH);
        imagem = new ImageIcon(imagemRedimensionada);
        JLabel imagemLabel = new JLabel(imagem);

        JButton carregarImagem = new JButton("Carregar Imagem");
        carregarImagem.setMaximumSize(new Dimension(380, 30));

        rightPanel.add(imagemLabel);
        rightPanel.add(Box.createVerticalStrut(10));
        rightPanel.add(carregarImagem);

        return rightPanel;
    }
}
