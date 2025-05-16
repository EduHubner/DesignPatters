package atividadePizzaCerto;

public class Pizza {

	private int tamanho = 10;
	private boolean bacon = false;
	private boolean queijo = false;
	private boolean tomate = false;
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public boolean isBacon() {
		return bacon;
	}
	public void setBacon(boolean bacon) {
		this.bacon = bacon;
	}
	public boolean isQueijo() {
		return queijo;
	}
	public void setQueijo(boolean queijo) {
		this.queijo = queijo;
	}
	public boolean isTomate() {
		return tomate;
	}
	public void setTomate(boolean tomate) {
		this.tomate = tomate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pizza [tamanho=");
		builder.append(tamanho);
		builder.append(", bacon=");
		builder.append(bacon);
		builder.append(", queijo=");
		builder.append(queijo);
		builder.append(", tomate=");
		builder.append(tomate);
		builder.append("]");
		return builder.toString();
	}
	
	
}
