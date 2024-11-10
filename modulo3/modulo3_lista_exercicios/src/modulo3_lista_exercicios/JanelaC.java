package modulo3_lista_exercicios;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JanelaC extends JFrame{

	public JanelaC() {
		super("Janela C");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(670, 280);		
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel label = new JLabel("Faça um resumo de suas atividades profissionais");
		label.setBounds(10,10,300,15);
		panel.add(label);
		
		JTextArea areaTexto = new JTextArea(10,20);
		areaTexto.setLineWrap(true);
		areaTexto.setBounds(310, 10, 300, 200);
		panel.add(areaTexto);
		
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JanelaC();
	}
	
}
