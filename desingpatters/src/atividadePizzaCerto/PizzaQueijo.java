package atividadePizzaCerto;

public class PizzaQueijo implements IPizza {

	@Override
	public void Tamanho(int tamanho) {
		pizza.setTamanho(tamanho);

	}

	@Override
	public void queijo() {
		pizza.setQueijo(true);

	}

	@Override
	public void tomate() {
		pizza.setTomate(false);

	}

	@Override
	public void bacon() {
		pizza.setBacon(false);

	}

}
