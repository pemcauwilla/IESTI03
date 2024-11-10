package modulo3;

import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LanguagesPanel extends JPanel{
	public LanguagesPanel() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JLabel("Linguagens: "));
		add(new JCheckBox("Java"));
		add(new JCheckBox("Python"));
		add(new JCheckBox("C++ "));
		add(new JCheckBox("Outras "));
	}
}
