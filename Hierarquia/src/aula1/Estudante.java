package aula1;

public class Estudante extends Pessoa {
	private String registro;
	private float nota1, nota2;
	
	Estudante (String nome, int nascimento, String registro, float nota1, float nota2) {
		super(nome, nascimento);
		
		 this.registro = registro;
		 this.nota1 = nota1;
		 this.nota2 = nota2;
	}
	
	public String getRegistro() {
		return registro;
	}



	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	
	public float calculaMedia() {
		return (nota1 + nota2) / 2;
	}

	@Override
	public String toString() {
		return "Estudante [registro=" + registro + ", " + super.toString() + ", nota1=" + nota1 + ", nota2=" + nota2 + ", media="
				+ calculaMedia() + "]";
	}

	
}
