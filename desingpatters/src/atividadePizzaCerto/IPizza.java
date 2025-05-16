package atividadePizzaCerto;

public interface IPizza {

	Pizza pizza = new Pizza();
	
	public void Tamanho (int tamanho);
	public void queijo();
	public void tomate();
	public void bacon();
	public default Pizza build() {
		return pizza;
	}
}
