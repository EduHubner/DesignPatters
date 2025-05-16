package desingFluenceInterface;

public class Main {

	public static void main(String[] args) {
	
		Pessoa pessoa = new Pessoa();
		
		pessoa.chamado("Eduardo").comCargo("Estudante");
		
		System.out.println(pessoa);
		
		Pessoa p = new Pessoa();
		System.out.println(p);
		
		Pessoa p2 = new Pessoa();
		p2.comCargo("Gari");
		System.out.println(p2);
	}

}
