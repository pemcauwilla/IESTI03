package modulo3;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class AnniversaryPanel extends JPanel{
	public AnniversaryPanel(String label, int maxValue) {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JLabel(label + ":"));
		JSpinner spinner = new JSpinner(new SpinnerNumberModel(0, 0, maxValue, 1));
        spinner.setPreferredSize(new Dimension(60, spinner.getPreferredSize().height)); 
        
        add(spinner);
	}
}
