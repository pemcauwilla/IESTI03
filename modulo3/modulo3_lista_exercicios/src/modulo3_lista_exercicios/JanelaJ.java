package modulo3_lista_exercicios;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import javax.swing.*;

public class JanelaJ extends JFrame {

	public JPanel mainPanel() {
		 JPanel panel = new JPanel();
		 panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); 

	     JLabel row1 = new JLabel("Running a long task");
	     JLabel row2 = new JLabel("Completed 43%");
	     
	     JProgressBar bar = new JProgressBar();
	     bar.setValue(43); 
	     bar.setMaximum(100);
	         
	     row1.setAlignmentX(JLabel.LEFT_ALIGNMENT);
	     row2.setAlignmentX(JLabel.LEFT_ALIGNMENT);
	     bar.setAlignmentX(JProgressBar.LEFT_ALIGNMENT);
	     
	     panel.add(row1);
	     panel.add(Box.createVerticalStrut(5)); 
	     panel.add(row2);
	     panel.add(Box.createVerticalStrut(5));
	     panel.add(bar);
	     
	     return panel;
	}
	
	
    public JanelaJ() {
        super("Progress...");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        Object[] options = {"Cancel"};
        
        JPanel panel = mainPanel();
        
        JOptionPane.showOptionDialog(null, panel, "Janela 10",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null, options, options[0]);
    }

    public static void main(String[] args) {
        new JanelaJ();
    }
}
