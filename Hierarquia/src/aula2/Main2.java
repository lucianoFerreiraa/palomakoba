package aula2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("Iniciando");
		
		ArrayList<Empregado> empregados = new ArrayList<Empregado>();

		int opt = 0;
		
		while(opt != 7) {
			String nome, setor, salarioFixo, bonus, quantidadeVistoria, valorVistoria, textEmpregados;
			
			String opcao = JOptionPane.showInputDialog(null,
				"\n1 - Insere um Engenheiro" +
				"\n2 - Insere um Diretor" +
				"\n3 - Insere um Caixa" +
				"\n4 - Exibe todos os Empregados" +
				"\n5 - Exibe todos os Engenheiros" +
				"\n6 - Exibe todos os Caixas" +
				"\n7 - Sair"
			);
				
			switch (opcao.charAt(0)) {
				case '1':
					nome = JOptionPane.showInputDialog(null, "Nome ?");
					setor = JOptionPane.showInputDialog(null, "Setor ?");
					quantidadeVistoria = JOptionPane.showInputDialog(null, "Quantidade de Vistorias ?");
					valorVistoria = JOptionPane.showInputDialog(null, "Valor por Vistoria ?");
					
					Engenheiro e = new Engenheiro(nome, setor, Integer.parseInt(quantidadeVistoria), Float.parseFloat(valorVistoria));
					
					empregados.add(e);
					
					break;
				case '2':
					nome = JOptionPane.showInputDialog(null, "Nome ?");
					setor = JOptionPane.showInputDialog(null, "Setor ?");
					
					Diretor d = new Diretor(nome, setor);
					
					empregados.add(d);
					break;
				case '3':
					nome = JOptionPane.showInputDialog(null, "Nome ?");
					setor = JOptionPane.showInputDialog(null, "Setor ?");
					salarioFixo = JOptionPane.showInputDialog(null, "Valor do Salario ?");
					bonus = JOptionPane.showInputDialog(null, "Bonus do Caixa ?");
					
					Caixa c = new Caixa(nome, setor, Float.parseFloat(salarioFixo), Float.parseFloat(bonus));
					
					empregados.add(c);
					
					break;
				case '4':
					textEmpregados = "Empregados:\n";
					for (Empregado emp : empregados) {
						textEmpregados += (emp.toString() + "\n");
					}
					
					JOptionPane.showMessageDialog(null, textEmpregados);
					break;
				case '5':
					textEmpregados = "Engenheiros:\n";
					for (Empregado emp : empregados) {
						if (emp.getClass() == Engenheiro.class) {
							textEmpregados += (emp.toString() + "\n");							
						}
					}
					
					JOptionPane.showMessageDialog(null, textEmpregados);
					break;
				case '6':
					textEmpregados = "Caixas:\n";
					for (Empregado emp : empregados) {
						if (emp.getClass() == Caixa.class) {
							textEmpregados += (emp.toString() + "\n");							
						}
					}
					
					JOptionPane.showMessageDialog(null, textEmpregados);
					break;
				case '7':
					JOptionPane.showMessageDialog(null, "Encerrando programa, tchau tchau!");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcao invalida!!");
					break;
			}
			
			try {
				opt = Integer.parseInt(opcao);				
			} catch (Error e) {
				opt = 0;
			}
		}
		
		
	}

}
