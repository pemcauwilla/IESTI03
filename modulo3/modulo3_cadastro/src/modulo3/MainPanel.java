package modulo3;


import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MainPanel extends JPanel{
		
	public MainPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel title = new JPanel(new FlowLayout(FlowLayout.LEFT));
		title.add(new JLabel("Cadastro do Programador"));
		
		JPanel anniversaryTitle = new JPanel(new FlowLayout(FlowLayout.LEFT));
		anniversaryTitle.add(new JLabel("Data de aniversário"));
		
		JPanel presentationTitle = new JPanel(new FlowLayout(FlowLayout.LEFT));
		presentationTitle.add(new JLabel("Apresentação Pessoal"));
		
		JPanel jobsTitle = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jobsTitle.add(new JLabel("Vagas Disponíveis"));
		
		add(title);
        add(new InfoPanel("Nome: "));
        add(new InfoPanel("CPF: "));
        
        add(anniversaryTitle);
        add(new AnniversaryPanel("Dia", 30));
        add(new AnniversaryPanel("Mês", 12));
        add(new AnniversaryPanel("Ano", 3000));
        
        add(presentationTitle);
        add(new TextSquare(5,20));
        add(new GenderPanel());
        add(new LanguagesPanel());
	
        add(new KnowledgePanel());
        
        add(jobsTitle);
        add(new JobTablePanel());
        
        add(new TypePanel());
        
        add(new SendPanel());
	}
}
