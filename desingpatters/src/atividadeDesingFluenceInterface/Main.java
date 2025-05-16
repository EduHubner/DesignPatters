package atividadeDesingFluenceInterface;

public class Main {

	public static void main(String[] args) {
		
		Conexao conn = new Conexao();
		
		conn.naHost("hostlocal").comPorta("3307").doUser("Eduardo").comPass("admin123");
		
		System.out.println(conn);
		
		System.out.println("jdbc: mysql:/" + conn.getHost() + ":" + conn.getPorta() + "/banco");
	}

}
