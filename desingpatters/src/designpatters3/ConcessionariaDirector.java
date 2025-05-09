package designpatters3;

public class ConcessionariaDirector {

	protected CarroBuilder montadora;
	
	public ConcessionariaDirector(CarroBuilder montadora) {
		this.montadora = montadora;
	}
	
	public void contruirCarro() {
		montadora.buildPreco();
		montadora.buildAnoDeFabricacao();
		montadora.buildDscMotor();
		montadora.buildMontadora();
		montadora.buildModelo();
	}
	
	public CarroProduct getCarro() {
		return montadora.getCarro();
	}
}
