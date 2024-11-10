package modulo3;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextSquare extends JPanel{

	private JTextArea text;
	
	public TextSquare(int width, int height) {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		text = new JTextArea(width, height);
		text.setLineWrap(true);
		text.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		add(text);
		
	}
	
}
