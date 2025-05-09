package atividadeFactoryMethod;

public class FuncionarioContabilidade extends Funcionario implements IFuncionario {

	private int numReciboGerado;
	
	public FuncionarioContabilidade(String nome, String cpf, int numReciboGerado) {
		this.nome = nome;
		this.cpf = cpf;
		this.numReciboGerado = numReciboGerado;
	}
	
	public int getNumReciboGerado() {
		return numReciboGerado;
	}
	public void setNumReciboGerado(int numReciboGerado) {
		this.numReciboGerado = numReciboGerado;
	}
	
	
	public String exibirInfo() {
		// TODO Auto-generated method stub
		return "Funcionário da Contabilidade\n "
				+ "Nome: " + this.nome +
				"\nNúmerio de Recibos gerados: " + this.numReciboGerado;
	}
	

}
