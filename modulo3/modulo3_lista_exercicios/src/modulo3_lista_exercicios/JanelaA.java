package modulo3_lista_exercicios;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JanelaA extends JFrame{

	public JanelaA() {
		super("Janela A"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 100);	
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel label = new JLabel("Interface gráfica com Java Swing");
		label.setBounds(10,10,200,20);
		
		panel.add(label);
		add(panel);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JanelaA();
	}
	
}
