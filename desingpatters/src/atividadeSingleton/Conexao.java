package atividadeSingleton;


public class Conexao {

	private static Conexao con;
	
	private Cliente cliente;
	
	private Conexao() {

	}
	
	public static Conexao getInstance() {
		if (con == null) {
			con = new Conexao();
			/*Class.forName(jdbcDriver);
			con = DriverManager.getConnection("jdbc: mysql:/" + con.getCliente().getHost() + ":" + con.getCliente().getPorta() + "/meu_bd", con.getCliente().getUsuario(), con.getCliente().getSenha());*/
		}
		return con;
	}

	public static Conexao getCon() {
		return con;
	}
	public static void setCon(Conexao con) {
		Conexao.con = con;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conexao [cliente=");
		builder.append(cliente);
		builder.append("]");
		return builder.toString();
	}
	
	
}
