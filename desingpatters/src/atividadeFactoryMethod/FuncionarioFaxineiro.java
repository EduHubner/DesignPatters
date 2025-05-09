package atividadeFactoryMethod;

public class FuncionarioFaxineiro extends Funcionario implements IFuncionario {

	private int numSalasLimpadas;
	
	public FuncionarioFaxineiro(String nome, String cpf, int numSalasLimpadas) {
		this.nome = nome;
		this.cpf = cpf;
		this.numSalasLimpadas = numSalasLimpadas;
	}
	
	
	public int getNumSalasLimpadas() {
		return numSalasLimpadas;
	}
	public void setNumSalasLimpadas(int numSalasLimpadas) {
		this.numSalasLimpadas = numSalasLimpadas;
	}

	public String exibirInfo() {
		return "Funcionário da Faxina\n "
				+ "Nome: " + this.nome +
				"\nNúmerio de Recibos gerados: " + this.numSalasLimpadas;
	}

}
