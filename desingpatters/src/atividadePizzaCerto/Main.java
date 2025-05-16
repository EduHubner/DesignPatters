package atividadePizzaCerto;

public class Main {

	public static void main(String[] args) {
		
		PizzaDirector pd = new PizzaDirector(new PizzaBacon());
		pd.construirPizza(10);
		Pizza p1 = pd.getPizza();
		System.out.println(p1);
		
		pd = new PizzaDirector(new PizzaTomate());
		pd.construirPizza(30);
		Pizza p2 = pd.getPizza();
		System.out.println(p2);
		
		pd = new PizzaDirector(new PizzaQueijo());
		pd.construirPizza(60);
		Pizza p3 = pd.getPizza();
		System.out.println(p3);

	}

}
