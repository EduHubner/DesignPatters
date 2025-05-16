package desingPrototype;

public class Main {

	public static void main(String[] args) {
		CarroPrototype fiestaPrototype = new FiestaPrototype();
		CarroPrototype fiestaNovo = fiestaPrototype.clonar();

		System.out.println(fiestaNovo);		
		fiestaNovo.setValorCompra(27900.0);
		
		CarroPrototype fiestaUsado = fiestaPrototype.clonar();
		fiestaUsado.setValorCompra(21000.0);

		System.out.println(fiestaNovo.exibirInfo());
		System.out.println(fiestaUsado.exibirInfo());
	}

}
