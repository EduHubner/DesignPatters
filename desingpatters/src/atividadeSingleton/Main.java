package atividadeSingleton;

public class Main { // SINGLETON

	public static void main(String[] args) {
		Cliente c1 = new Cliente("1234", 1234, "root", 2088);
		Cliente c2 = new Cliente("2222", 2222, "rooot", 2222);
		Cliente c3 = new Cliente("3333", 3333, "roott", 3333);
		
		Conexao con = Conexao.getInstance();
		
		con.setCliente(c1);
		
		System.out.println(con);
		
		con.setCliente(c2);
		
		System.out.println(con);
		
		con.setCliente(c3);
		
		System.out.println(con);
		
		

	}

}
