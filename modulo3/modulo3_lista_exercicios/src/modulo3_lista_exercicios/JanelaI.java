package modulo3_lista_exercicios;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class JanelaI extends JFrame{

	public JanelaI() {
		super("Janela I");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);		
		setLocationRelativeTo(null);
		
		String[] options = {"one", "two", "three", "four", "five", "six", "seven"};
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JList<String> list = new JList<String>(options);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setVisibleRowCount(3);
			
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(10, 10, 60, 90);
		panel.add(scrollPane);
		
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JanelaI();
	}
	
}
