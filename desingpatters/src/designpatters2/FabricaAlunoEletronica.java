package designpatters2;

public class FabricaAlunoEletronica implements FabricaDeAluno {

	@Override
	public Aluno criarAluno() {
		return new AlunoEletronica();
	}

	
}
