package modulo3_lista_exercicios;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JanelaB extends JFrame{

	public JanelaB() {
		super("Janela B");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 100);		
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel label = new JLabel("Nome");
		label.setBounds(10,10,50,20);
		panel.add(label);
		
		JTextField textField = new JTextField(10);
		textField.setBounds(50,10,100,20);
		panel.add(textField);
		
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JanelaB();
	}
	
}
