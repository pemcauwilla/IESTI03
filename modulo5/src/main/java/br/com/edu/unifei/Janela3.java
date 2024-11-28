package br.com.edu.unifei;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.BorderFactory;

public class Janela3 extends JFrame{
    public Janela3(){
        setTitle("Testing JTextField and JPasswordField");
        setSize(400,100);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        JTextField textField = new JTextField(10);
        textField.setPreferredSize(new Dimension(10,30));

        JButton enviar = new JButton("ENVIAR");
        enviar.setBorder(BorderFactory.createLineBorder(Color.RED));
        enviar.setBackground(Color.WHITE);
        enviar.setPreferredSize(new Dimension(70,30));    
        
        enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,textField.getText(), getTitle(), JOptionPane.INFORMATION_MESSAGE);
            }
        });

        add(textField);
        add(enviar);
        
        setVisible(true);
    }
}
