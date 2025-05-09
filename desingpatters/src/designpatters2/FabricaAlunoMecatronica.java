package designpatters2;

public class FabricaAlunoMecatronica implements FabricaDeAluno {

	@Override
	public Aluno criarAluno() {
		return new AlunoMecatronica();
	}

}
