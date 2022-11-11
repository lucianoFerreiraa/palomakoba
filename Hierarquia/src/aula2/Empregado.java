package aula2;

public abstract class Empregado {
	private String nome;
	private String setor;
	abstract double getPagamento();
	
	Empregado(String nome, String setor){
		this.nome = nome;
		this.setor = setor;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", setor=" + setor + "]";
	}
}
