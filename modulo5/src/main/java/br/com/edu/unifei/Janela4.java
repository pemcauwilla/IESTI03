package br.com.edu.unifei;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class Janela4 extends JFrame{

    private List<Integer> numeros = new ArrayList<Integer>();

    public void createOnGrid(int row, int column, GridBagConstraints c, JComponent component, JPanel panel) {
        c.gridx = column;
        c.gridy = row;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(0, 5, 0, 25); 
        c.fill = GridBagConstraints.HORIZONTAL;

        if(component instanceof JTextField){
            component.setPreferredSize(new Dimension(70,30));
        }

        if(component instanceof JLabel){
            c.anchor = GridBagConstraints.CENTER; 
            c.fill = GridBagConstraints.NONE;
        }

        panel.add(component, c);
    }

    private void actionListenerOK(JTextField numeroField){
        int numero = Integer.parseInt(numeroField.getText());
        numeros.add(numero);
        numeroField.setText("");  
    }

    public Janela4() {
        setSize(600, 350);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JLabel numeroLabel = new JLabel("Digite o número");
        numeroLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, getWidth()));
    
        JPanel panel1 = new JPanel(new GridLayout(1, 2, 10, 0));
        panel1.setPreferredSize(new Dimension(300, 30));

        JTextField numeroField = new JTextField();

        JButton okButton = new JButton("OK");

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionListenerOK(numeroField);
            }
        });

        
        panel1.add(numeroField);
        panel1.add(okButton);
    
        JPanel panel2 = new JPanel(new GridBagLayout());
        panel2.setPreferredSize(new Dimension(getWidth(), getHeight() - (getHeight()/3)));
        GridBagConstraints c = new GridBagConstraints();
    
        JButton showButton = new JButton("Exibir");
        showButton.setPreferredSize(new Dimension(60,30));
        
        JTextField maior = new JTextField();
        JTextField menor = new JTextField();
        JTextField media = new JTextField();

        maior.setFocusable(false);
        menor.setFocusable(false);
        media.setFocusable(false);


        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        
            OptionalInt max = numeros.stream().mapToInt(Integer::intValue).max();
            if (max.isPresent()) {
                maior.setText(String.valueOf(max.getAsInt()));  
            } else {
                maior.setText("Nenhum número");
            }

        
            OptionalInt min = numeros.stream().mapToInt(Integer::intValue).min();
            if (min.isPresent()) {
                menor.setText(String.valueOf(min.getAsInt()));  
            } else {
                menor.setText("Nenhum número");
            }

            OptionalDouble avg = numeros.stream().mapToInt(Integer::intValue).average();
            if (avg.isPresent()) {
                media.setText(String.format("%.2f", avg.getAsDouble()));  
            } else {
                media.setText("Nenhum número");
            }
    }
        });

        createOnGrid( 0, 0, c, new JLabel("Maior >>>"), panel2);
        createOnGrid( 1, 0, c, new JLabel("Menor >>>"), panel2);
        createOnGrid( 2, 0, c, new JLabel("Média >>>"), panel2);
        createOnGrid( 0, 1, c, maior, panel2);
        createOnGrid( 1, 1, c, menor, panel2);
        createOnGrid( 2, 1, c, media, panel2);
        createOnGrid( 1, 2, c, showButton, panel2);
    
        add(numeroLabel);
        add(panel1);
        add(Box.createRigidArea(new Dimension(400, 10))); 
        add(panel2);
    
        setVisible(true);
    }


}
