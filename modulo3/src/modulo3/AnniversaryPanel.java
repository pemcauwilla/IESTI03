package modulo3;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class AnniversaryPanel extends JPanel{
	public AnniversaryPanel(String label) {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JLabel(label + ":"));
		add(new JSpinner(new SpinnerNumberModel(0, 0, 3000, 1))); 
	}
}
