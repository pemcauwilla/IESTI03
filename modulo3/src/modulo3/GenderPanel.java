package modulo3;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GenderPanel extends JPanel{
	public GenderPanel() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JLabel("Sexo: "));
		add(new JRadioButton("masculino"));
		add(new JRadioButton("feminino"));
	}
}
