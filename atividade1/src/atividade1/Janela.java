package atividade1;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Janela extends JFrame{
	
	private String nome;
	private String[] opcoes_J1 = {"Sim", "Não", "Cancelar"};
	private String[] opcoes_J2 = {"Sim - Objeto é legal", "Não - Objeto é sofrimento", "Talvez - Quero Aprender"};
	private int escolha;
	
	public Janela(){
		
		nome = JOptionPane.showInputDialog(this, "Qual é o seu nome?","Entrada",JOptionPane.QUESTION_MESSAGE); // Mostra a janela de input e armazena em nome
		JOptionPane.showMessageDialog(this, "Olá " + nome + ", seja bem vindo ao módulo de interfaces gráficas no Java!", "Mensagem", JOptionPane.INFORMATION_MESSAGE); // Mostra a janela de mensagens
		escolha = JOptionPane.showOptionDialog(this, nome + "! Você gosta de programar?", // Mostra a  primeira janela de opções
				"Selecionar uma Opção", JOptionPane.CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes_J1, opcoes_J1[0]);
		
		if(escolha == 1) { // Resposta é não
			JOptionPane.showMessageDialog(this, "Que pena. Mas com as janelas você vai gostar", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
		}else if(escolha == 0){ // Resposta é sim
			JOptionPane.showMessageDialog(this, "Então estude bem o Java Swing. Ele pode abrir várias portas para você", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
		} 
		
		escolha = JOptionPane.showOptionDialog(this, "Lembrete, aqui no Java Swing tudo é objeto. Você gosta disso?", // Mostra a segunda janela de opções
				"Atenção", JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes_J2, opcoes_J2);
		
		if(escolha == 0) { // Resposta é sim
			JOptionPane.showMessageDialog(this, "Ótimo, todos os componentes são objetos", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
		}else if(escolha == 1) { // Ressposta é não
			JOptionPane.showMessageDialog(this, "Não se preocupe. Agora você irá aprender a importância dos objetos", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
		}else if(escolha == 2) { // Resposta é talvez
			JOptionPane.showMessageDialog(this, "Sim, você aprenderá", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	
	public static void main(String[] args) {
		Janela nova_janela = new Janela();
	}
}