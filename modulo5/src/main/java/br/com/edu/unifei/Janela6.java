package br.com.edu.unifei;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Janela6 extends JFrame {

    private JTextField campoNome;
    private JTextField campoEndereco;
    private JTextField campoCidade; 
    private JComboBox<String> comboBoxEstado;
    private JRadioButton masculino;
    private JRadioButton feminino;
    private JCheckBox curso1;
    private JCheckBox curso2;
    private JCheckBox curso3;
    private JTextArea textAreaInteresses;
    private JTextArea textAreaObservacoes;

    public Janela6() {
        setSize(500, 550);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.LEFT));

        JPanel panelEsquerda = new JPanel();
        panelEsquerda.setLayout(new BoxLayout(panelEsquerda, BoxLayout.Y_AXIS));

        panelEsquerda.add(criaEntrada("Nome:", 20));
        panelEsquerda.add(Box.createRigidArea(new Dimension(0, 10)));
        panelEsquerda.add(criaEntrada("Endereço:", 20));
        panelEsquerda.add(Box.createRigidArea(new Dimension(0, 10)));
        panelEsquerda.add(criaLinha3());  
        panelEsquerda.add(criaLinha4());
        panelEsquerda.add(criaLinha5());
        panelEsquerda.add(criaLinha6());
        panelEsquerda.add(criaLinha7());

        JButton inserir = new JButton("Inserir");
        JPanel panelDireita = new JPanel();
        panelDireita.setPreferredSize(new Dimension(75, getHeight() - 70));
        panelDireita.add(inserir);

        
        inserir.addActionListener(e -> eventoSalvar());

        add(panelEsquerda);
        add(Box.createRigidArea(new Dimension(6, 0)));
        add(panelDireita);
        setVisible(true);
    }

    private JPanel criaEntrada(String texto, int width) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel label = new JLabel(texto);
        JTextField textField = new JTextField(width);
        panel.add(label);
        panel.add(textField);

    
        if (texto.equals("Nome:")) {
            campoNome = textField;
        } else if (texto.equals("Endereço:")) {
            campoEndereco = textField;
        }

        return panel;
    }

    private JPanel criaLinha3() {
        JPanel linha3 = new JPanel();
        linha3.setLayout(new FlowLayout(FlowLayout.LEFT));
        String estados[] = {
            "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", 
            "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"
        };
        JLabel estado = new JLabel("Estado: ");
        JComboBox<String> comboBox = new JComboBox<>(estados);
        comboBoxEstado = comboBox; 
        campoCidade = new JTextField(10); 

        linha3.add(new JLabel("Cidade: "));
        linha3.add(campoCidade);  
        linha3.add(estado);
        linha3.add(comboBoxEstado);

        return linha3;
    }

    private JPanel criaLinha4() {
        JPanel linha4 = new JPanel();
        linha4.setLayout(new FlowLayout(FlowLayout.LEFT));

        masculino = new JRadioButton("Masculino");
        feminino = new JRadioButton("Feminino");

        ButtonGroup group = new ButtonGroup();
        group.add(masculino);
        group.add(feminino);

        linha4.add(new JLabel("Sexo: "));
        linha4.add(masculino);
        linha4.add(feminino);
        return linha4;
    }

    private JPanel criaLinha5() {
        JPanel linha5 = new JPanel();
        linha5.setLayout(new FlowLayout(FlowLayout.LEFT));

        curso1 = new JCheckBox("Curso 1");
        curso2 = new JCheckBox("Curso 2");
        curso3 = new JCheckBox("Curso 3");

        linha5.add(new JLabel("Opções: "));
        linha5.add(curso1);
        linha5.add(curso2);
        linha5.add(curso3);
        return linha5;
    }

    private JPanel criaLinha6() {
        JPanel linha6 = new JPanel();
        linha6.setLayout(new FlowLayout(FlowLayout.LEFT));

        textAreaInteresses = new JTextArea();
        textAreaInteresses.setLineWrap(true);
        textAreaInteresses.setWrapStyleWord(true);

        JPanel meio = new JPanel();
        meio.setLayout(new BoxLayout(meio, BoxLayout.Y_AXIS));

        JButton esquerda = new JButton("<<");
        JButton direita = new JButton(">>");

        meio.add(direita);
        meio.add(Box.createRigidArea(new Dimension(0, 10)));
        meio.add(esquerda);
        meio.add(Box.createRigidArea(new Dimension(0, 42)));

        JTextArea textArea2 = new JTextArea(7, 13);
        textArea2.setLineWrap(true);
        textArea2.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textAreaInteresses);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(150, 110));

        linha6.add(scrollPane);
        linha6.add(meio);
        linha6.add(textArea2);
        linha6.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Interesses"), null));
        return linha6;
    }

    private JPanel criaLinha7() {
        JPanel linha7 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        textAreaObservacoes = new JTextArea(6, 32);
        textAreaObservacoes.setLineWrap(true);
        textAreaObservacoes.setWrapStyleWord(true);

        linha7.add(textAreaObservacoes);
        linha7.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Observações"), null));
        return linha7;
    }

    public void eventoSalvar() {
        String nome = campoNome.getText();
        String endereco = campoEndereco.getText();
        String cidade = campoCidade.getText(); // Agora, a cidade é acessada corretamente
        String estadoSelecionado = (String) comboBoxEstado.getSelectedItem();
        String sexo = masculino.isSelected() ? "Masculino" : feminino.isSelected() ? "Feminino" : "Não selecionado";
        String cursosSelecionados = "";
        if (curso1.isSelected()) cursosSelecionados += "Curso 1, ";
        if (curso2.isSelected()) cursosSelecionados += "Curso 2, ";
        if (curso3.isSelected()) cursosSelecionados += "Curso 3, ";
        if (!cursosSelecionados.isEmpty()) cursosSelecionados = cursosSelecionados.substring(0, cursosSelecionados.length() - 2);
        String interesses = textAreaInteresses.getText();
        String observacoes = textAreaObservacoes.getText();

        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estadoSelecionado);
        System.out.println("Sexo: " + sexo);
        System.out.println("Cursos: " + cursosSelecionados);
        System.out.println("Interesses: " + interesses);
        System.out.println("Observações: " + observacoes);
    }

}
