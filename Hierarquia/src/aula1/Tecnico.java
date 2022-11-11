package aula1;

public class Tecnico extends Pessoa {
	private String setor;
	private String siape;
	
	Tecnico(String nome, int nascimento, String setor, String siape) {
		super(nome, nascimento);
		
		this.setor = setor;
		this.siape = siape;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}

	@Override
	public String toString() {
		return "Tecnico [setor=" + setor + ", " + super.toString() + ", siape=" + siape + "]";
	}
	
	
}
