package modulo3;

import javax.swing.JFrame;

public class MainFrame extends JFrame{

	public MainFrame(String frameName) {
		super(frameName);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 800);		
		setLocationRelativeTo(null);
			
		add(new MainPanel());
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MainFrame("Minha Janela");
	}
}
