package desingFluenceInterface;

public class Pessoa {

	private String nome;
	private String cargo;
	
	public Pessoa chamado(String nome) {
		this.nome = nome;
		return this;
	}
	
	public Pessoa comCargo(String cargo) {
		this.cargo = cargo;
		return this;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", cargo=");
		builder.append(cargo);
		builder.append("]");
		return builder.toString();
	}
	
	
}
