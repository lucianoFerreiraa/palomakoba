package aula2;

public class Engenheiro extends Empregado{
	private int quantidadeVistoria;
	private float valorVistoria;

	Engenheiro(String nome, String setor, int quantidadeVistoria, float valorVistoria) {
		super(nome, setor);
		
		this.quantidadeVistoria = quantidadeVistoria;
		this.valorVistoria = valorVistoria;
	}

	@Override
	double getPagamento() {
		return valorVistoria * quantidadeVistoria;
	}

	public int getQuantidadeVistoria() {
		return quantidadeVistoria;
	}

	public void setQuantidadeVistoria(int quantidadeVistoria) {
		this.quantidadeVistoria = quantidadeVistoria;
	}

	public float getValorVistoria() {
		return valorVistoria;
	}

	public void setValorVistoria(float valorVistoria) {
		this.valorVistoria = valorVistoria;
	}

	@Override
	public String toString() {
		return "Engenheiro [" + super.toString() + ", quantidadeVistoria=" + quantidadeVistoria + ", valorVistoria=" + valorVistoria + ", getPagamento=" + getPagamento() + "]";
	}
	
}
