package modulo3;

import java.util.Hashtable;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class KnowledgePanel extends JPanel{
	
	private JSlider knowledgeBar;
	private Hashtable<Integer, JLabel> labels;
	public KnowledgePanel() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JLabel("Nível de conhecimento em teste de software: "));
		
		labels = new Hashtable<>();
		
		labels.put(0, new JLabel("0"));
		labels.put(10, new JLabel("1"));
		labels.put(20, new JLabel("2"));
		labels.put(30, new JLabel("3"));
		
		knowledgeBar = new JSlider(0,30,15);
		knowledgeBar.setLabelTable(labels);
		knowledgeBar.setMajorTickSpacing(10);
		knowledgeBar.setMinorTickSpacing(1);
		knowledgeBar.setPaintTicks(true);
		knowledgeBar.setPaintLabels(true);
		
		add(knowledgeBar);
	}
}
