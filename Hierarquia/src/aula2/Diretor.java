package aula2;

public class Diretor extends Empregado {

	Diretor(String nome, String setor) {
		super(nome, setor);
	}

	@Override
	double getPagamento() {
		return 2500.0;
	}

}
