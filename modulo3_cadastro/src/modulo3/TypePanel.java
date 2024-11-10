package modulo3;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class TypePanel extends JPanel{
	
	private String[] options = {"Back-end       ", "Front-end       "};
	
	public TypePanel() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JLabel("Tipo: "));
		
		add(new JComboBox<>(options));
	}
}
