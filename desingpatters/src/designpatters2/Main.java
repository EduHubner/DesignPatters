package designpatters2;

public class Main { //FACTORY METHOD

	public static void main(String[] args) {
		FabricaDeAluno fabrica = new FabricaAlunoInformatica();
		Aluno aluno = fabrica.criarAluno();
		System.out.println(aluno.exibirInfo());
		
		fabrica = new FabricaAlunoEletronica();
		aluno = fabrica.criarAluno();
		System.out.println(aluno.exibirInfo());
		
		fabrica = new FabricaAlunoMecatronica();
		aluno = fabrica.criarAluno();
		System.out.println(aluno.exibirInfo());

	}

}
