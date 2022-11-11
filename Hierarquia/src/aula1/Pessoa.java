package aula1;
import java.util.Calendar;

public class Pessoa {
	
	private String nome;
	private int nascimento;

	public Pessoa(String nome, int nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNascimento() {
		return nascimento;
	}

	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}
	
	public int calcularIdade() {
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
		return anoAtual - nascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + calcularIdade() + "]";
	}


}
