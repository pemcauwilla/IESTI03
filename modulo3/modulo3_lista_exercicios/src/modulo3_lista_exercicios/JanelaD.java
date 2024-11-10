package modulo3_lista_exercicios;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class JanelaD extends JFrame{

	public JCheckBox createCheckBox(String text, int X, int Y, int width, int height) {
		JCheckBox newCheckBox = new JCheckBox(text);
		newCheckBox.setBounds(X,Y,width,height);
		
		return newCheckBox;
	}
	
	public JanelaD() {
		super("Janela D");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 100);		
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel cores = new JLabel("Cores preferidas: ");
		cores.setBounds(10,10,120,15);
		panel.add(cores);
		
		panel.add(createCheckBox("Azul",110,2,50,30));
		panel.add(createCheckBox("Preto",160,2,60,30));
		panel.add(createCheckBox("Amarelo",220,2,75,30));
		panel.add(createCheckBox("Verde",295,2,60,30));
		
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JanelaD();
	}
	
}
