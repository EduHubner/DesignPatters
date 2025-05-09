package atividadeSingleton;

public class Cliente {

	private String usuario;
	private int senha;
	private String host;
	private int porta;
	
	public Cliente(String usuario, int senha, String host, int porta) {
		this.usuario = usuario;
		this.senha = senha;
		this.host = host;
		this.porta = porta;
		
	}

	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPorta() {
		return porta;
	}
	public void setPorta(int porta) {
		this.porta = porta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [usuario=");
		builder.append(usuario);
		builder.append(", senha=");
		builder.append(senha);
		builder.append(", host=");
		builder.append(host);
		builder.append(", porta=");
		builder.append(porta);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
