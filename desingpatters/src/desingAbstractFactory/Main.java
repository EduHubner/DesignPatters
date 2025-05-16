package desingAbstractFactory;

public class Main {

	public static void main(String[] args) {
		FabricaDeCarro fabrica = new FabricaFiat();
		CarroSedan sedan = fabrica.criarCarroSedan();
		CarroPopular popular = fabrica.criarCarroPupular();
		System.out.println();
		sedan.exibirInfoSedan();
		System.out.println();
		popular.exibirInfoPopular();
		
		fabrica = new FabricaFord();
		sedan = fabrica.criarCarroSedan();
		popular = fabrica.criarCarroPupular();
		System.out.println();
		sedan.exibirInfoSedan();
		System.out.println();
		popular.exibirInfoPopular();

	}

}
