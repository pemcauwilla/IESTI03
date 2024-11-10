package modulo3;

import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class SendPanel extends JPanel{
	
	private ImageIcon icon;
	private JButton button;
	
	public SendPanel(){
		setLayout(new FlowLayout(FlowLayout.LEFT));
		icon = new ImageIcon("src\\send_icon.png");
		icon = new ImageIcon(icon.getImage().getScaledInstance(23,23, Image.SCALE_SMOOTH));
	
		button = new JButton("Enviar Formúlario", icon);
		button.setHorizontalTextPosition(SwingConstants.LEFT);
		
		add(button);
	}
}
