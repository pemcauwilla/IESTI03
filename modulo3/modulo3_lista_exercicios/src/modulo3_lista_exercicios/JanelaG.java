package modulo3_lista_exercicios;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JanelaG extends JFrame{

	public JLabel newLabel(String text, int X1, int Y1, int width, int height) {
		JLabel label = new JLabel(text);
		label.setBounds(X1,Y1, width, height);
		
		return label; 
		
	}
	
	public JTextField newField(int X1, int Y1, int width, int height) {
		JTextField field = new JTextField();
		field.setBounds(X1,Y1,width,height);
		
		return field;
	}
	
	public JRadioButton newRadioButton(String text, int X1, int Y1, int width, int height) {
		JRadioButton button = new JRadioButton(text);
		button.setBounds(X1,Y1,width,height);
		
		return button;
	}
	
	public JanelaG() {
		super("Janela G");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(520, 100);		
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		panel.add(newLabel("Nome:",10,7,40,20));
		panel.add(newField(55,2,100,30));
		
		panel.add(newLabel("Sexo:", 160, 7, 35, 20));
		
		JRadioButton masc = newRadioButton("Masculino", 195,7,85,20);
		JRadioButton fem = newRadioButton("Feminino", 276,7,80,20);
		
		ButtonGroup group = new ButtonGroup();
		group.add(masc);
		group.add(fem);
		
		panel.add(masc);
		panel.add(fem);
		
		Color cor = new Color(200,217,247);
		
		panel.add(JanelaF.createButton(cor,"Enviar", 360, 2, 120, 25));
	
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JanelaG();
	}
	
}
