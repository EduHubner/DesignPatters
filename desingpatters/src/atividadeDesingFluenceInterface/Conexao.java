package atividadeDesingFluenceInterface;

public class Conexao {

	private String host = "localhost";
	private String porta = "3306";
	private String user;
	private String pass;
	
	public Conexao naHost(String host) {
		this.host = host;
		return this;
	}
	
	public Conexao comPorta(String porta) {
		this.porta = porta;
		return this;
	}
	
	public Conexao doUser(String user) {
		this.user = user;
		return this;
	}
	
	public Conexao comPass(String pass) {
		this.pass = pass;
		return this;
	}

	public String getHost() {
		return host;
	}
	public String getPorta() {
		return porta;
	}
	public String getUser() {
		return user;
	}
	public String getPass() {
		return pass;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conexao [host=");
		builder.append(host);
		builder.append(", porta=");
		builder.append(porta);
		builder.append(", user=");
		builder.append(user);
		builder.append(", pass=");
		builder.append(pass);
		builder.append("]");
		return builder.toString();
	}
	
	
}
