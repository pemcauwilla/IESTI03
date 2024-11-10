package modulo3_lista_exercicios;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;


public class JanelaH extends JFrame{

	public JanelaH() {
		super("JanelaH");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 250);		
		setLocationRelativeTo(null);
		
		String[] columns = {"","",""};
		String[][] data = {{"Código", "Produto", "Descrição"}, {"1123", "Pendrive", "Pendrive 32GB"},{"2323", "HD SSD", "256 GB"},
		{"3333", "Memória RAM", "16GB"}, {"2344", "CPU", "i7"}};
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JTable table = new JTable(data,columns);
		table.setBounds(10,10,400,175);
		table.setRowHeight(35);
		table.setBorder(new LineBorder(Color.BLACK, 1));
		
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		
		for(int i = 0; i < 3; i++) {
			table.getColumnModel().getColumn(i).setPreferredWidth(120);
			table.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );
		}
			
		panel.add(table);
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JanelaH();
	}
	
}
