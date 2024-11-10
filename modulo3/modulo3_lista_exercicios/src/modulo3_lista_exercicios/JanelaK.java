package modulo3_lista_exercicios;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JanelaK extends JFrame{

	 public JTree createTree() {

	    	DefaultMutableTreeNode root = new DefaultMutableTreeNode("The Java Series");

	        DefaultMutableTreeNode fstFolder = new DefaultMutableTreeNode("Book for Java I");
	        DefaultMutableTreeNode sndFolder = new DefaultMutableTreeNode("Book for Java II");

	        DefaultMutableTreeNode sndFolderSon1 = new DefaultMutableTreeNode("The Java Virtual Machine");
	        DefaultMutableTreeNode sndFolderSon2 = new DefaultMutableTreeNode("The Java Language");

	        root.add(fstFolder);
	        root.add(sndFolder);
	        
	        JTree tree = new JTree(root);
	    	tree.setBounds(10, 10, 200, 100);
	        
	        sndFolder.add(sndFolderSon1);
	        sndFolder.add(sndFolderSon2);

	        return tree;
	        
	    }
	
    public JanelaK() {
    	super("Janela K");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300); 
    	
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(createTree());
        
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        JanelaK janelaK = new JanelaK();
        
    }
}