package aula2;

public class Caixa extends Empregado {
	private float salarioFixo;
	private float bonus;

	Caixa(String nome, String setor, float salarioFixo, float bonus) {
		super(nome, setor);
		
		this.bonus = bonus;
		this.salarioFixo = salarioFixo;
	}

	@Override
	double getPagamento() {
		return (salarioFixo + bonus);
	}

	public float getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(float salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Caixa [" + super.toString() + ", salarioFixo=" + salarioFixo + ", bonus=" + bonus + "]";
	}
	
}
