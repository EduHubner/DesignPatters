package desingPrototype;

public class FiestaPrototype extends CarroPrototype {

	protected FiestaPrototype(FiestaPrototype fiestaPrototype) {
		this.valorCompra = fiestaPrototype.getValorCompra();
	}
	
	public FiestaPrototype() {
		this.valorCompra = 0.0;
	}
	
	@Override
	public String exibirInfo() {
		return "Modelo: Fiesta\nMontadora: Ford\nValor: R$:" + getValorCompra();
	}

	@Override
	public CarroPrototype clonar() {
		return new FiestaPrototype(this);
	}

}
