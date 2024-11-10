package modulo3;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GenderPanel extends JPanel{
	public GenderPanel() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JRadioButton masc = new JRadioButton("masculino");
		JRadioButton fem = new JRadioButton("feminino");
		
		ButtonGroup group = new ButtonGroup();
		group.add(masc);
		group.add(fem);
		
		add(new JLabel("Sexo: "));
		add(masc);
		add(fem);
	}
}
