package designpatters3;

public class Main {

	public static void main(String[] args) {
		ConcessionariaDirector conc = new ConcessionariaDirector(new FiatBuilder());
		conc.contruirCarro();
		CarroProduct carro = conc.getCarro();
		System.out.println(carro);
		
		conc = new ConcessionariaDirector(new VolksBuilder());
		conc.contruirCarro();
		carro = conc.getCarro();
		System.out.println(carro);
	}


}
