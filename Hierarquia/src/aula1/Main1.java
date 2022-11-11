package aula1;

public class Main1 {

	public static void main(String[] args) {
		
		// Orientação a Objetos
		
		Pessoa pessoa1 = new Pessoa("Ciclano", 1988);
		Pessoa pessoa2 = new Pessoa("Fulano", 2000);
		
		System.out.println(pessoa1.toString());
		System.out.println(pessoa2.toString());
		
		System.out.println("\n\n----------\n\n");
		
		// Heranca		

		Estudante estudante1 = new Estudante("Beltrano", 1990, "BR3323", 10, 8);
		
		System.out.println(estudante1.toString());
		
		System.out.println("\n\n----------\n\n");
		
		// Atividade 
		
		Tecnico tecnico1 = new Tecnico("John Doe", 2000, "Prefeitura", "20023323");
		
		System.out.println(tecnico1.toString());
		
		tecnico1.setSetor("DTI");
		
		System.out.println(tecnico1.toString());
	}

}
