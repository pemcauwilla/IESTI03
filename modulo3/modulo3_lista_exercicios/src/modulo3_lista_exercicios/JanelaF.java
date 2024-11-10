package modulo3_lista_exercicios;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaF extends JFrame{

	public static JButton createButton(Color cor, String text, int X, int Y, int width, int height) {
			JButton newButton = new JButton(text);
			newButton.setBounds(X,Y,width,height);
			newButton.setBackground(cor);
			
			return newButton;
	}
	
	public JanelaF() {
		super("Janela F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 100);		
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		Color lightBlue = new Color(200,217,247);
		
		panel.add(createButton(lightBlue, "Cancelar", 10, 10, 200, 40));
		panel.add(createButton(lightBlue, "Salvar", 230, 10, 200, 40));
		panel.add(createButton(lightBlue, "Enviar", 450, 10, 200, 40));
		
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JanelaF();
	}
	
}
