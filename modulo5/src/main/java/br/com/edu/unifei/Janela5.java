package br.com.edu.unifei;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Janela5 extends JFrame{

    public Janela5() {
        setSize(400, 200);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        GridBagConstraints c = new GridBagConstraints();
        
        JLabel label = new JLabel("Valores: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 30, 0, 0);
        c.gridx = 0; 
        c.gridy = 0; 
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.weighty = 1.0; 
        add(label, c);

        JTextField field = new JTextField();
        c.insets = new Insets(0, 0, 0, 0);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1; 
        c.gridy = 0; 
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0; 
        add(field, c);

        String [] options = {"Somar", "Multiplicar"};

        JComboBox<String> combo = new JComboBox<String>(options);
        c.insets = new Insets(0, 0, 0, 0);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1; 
        c.gridy = 1; 
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0; 
        add(combo, c);

        JButton button = new JButton("Calcular");
        c.insets = new Insets(0, 5, 0, 0);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2; 
        c.gridy = 1; 
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1.0;
        add(button, c);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String valores = field.getText();
                
                if (valores.length() == 2) {
                    int num1 = Integer.parseInt(valores.substring(0, 1));
                    int num2 = Integer.parseInt(valores.substring(1, 2));

                    String operacao = (String) combo.getSelectedItem();
                    int resultado = 0;

                    if (operacao.equals("Somar")) {
                        resultado = num1 + num2;
                    } else if (operacao.equals("Multiplicar")) {
                        resultado = num1 * num2;
                    }

                    field.setText("Resultado: " + resultado);
                }            
            }
        });

        setVisible(true);
    }

}
