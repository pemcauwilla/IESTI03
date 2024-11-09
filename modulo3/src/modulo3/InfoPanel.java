package modulo3;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InfoPanel extends JPanel{
	
	public InfoPanel(String text){
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JLabel(text, JLabel.CENTER));
		add(new JTextField(10));
	}

}
