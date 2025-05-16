package atividadePizzaCerto;

public class PizzaDirector {

	protected IPizza builder;
	
	public PizzaDirector(IPizza pizzabuilder) { //  Aqui passa qual pizza ele quer, dando um new
		this.builder = pizzabuilder;
	}
	
	public void construirPizza(int tamanho) {
		builder.bacon();
		builder.queijo();
		builder.tomate();
		builder.Tamanho(tamanho);
	}
	
	public Pizza getPizza() {
		return builder.build();
	}
}
