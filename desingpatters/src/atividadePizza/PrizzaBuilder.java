package atividadePizza;

public abstract class PrizzaBuilder {
	
	protected PizzaProduct pizza = new PizzaProduct();
	
	public abstract void buildPreco();
	public abstract void buildSabor();
	public abstract void buildTamanho();
	
	public PizzaProduct getPizza() {
		return pizza;
	}
}
