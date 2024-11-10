package modulo3_lista_exercicios;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JanelaE extends JFrame{

	public JanelaE() {
		super("Janela E");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);		
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel sexo = new JLabel("Sexo: ");
		sexo.setBounds(10,11,40,10);
		panel.add(sexo);
		
		JRadioButton masc = new JRadioButton("Masculino");
		masc.setBounds(50,10,85,15);
		panel.add(masc);
		
		JRadioButton fem = new JRadioButton("Feminino");
		fem.setBounds(132,10,85,15);
		panel.add(fem);
		
		ButtonGroup group = new ButtonGroup();
		group.add(masc);
		group.add(fem);
		
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JanelaE();
	}
	
}
