package modulo3;

import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTable;

public class JobTablePanel extends JPanel{
	String[] columns = {"",""};
	String[][] data = {{"Back-end", "Front-end"}, {"Java Spring", "React"}, {"Python Rest API", "Vue.js"}};
	JTable table;
	public JobTablePanel() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		table = new JTable(data,columns);
		table.setRowHeight(25);
		table.getColumnModel().getColumn(0).setPreferredWidth(120);
		table.getColumnModel().getColumn(1).setPreferredWidth(120);
		add(table);
	}
	
}
