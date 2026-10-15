package carros;

public class Hangar {

	public static void main(String[] args) {
		Aviao boeing = new Aviao();
		boeing.envergadura = 2.00;
		boeing.cor = "Branco";
		boeing.ano = 2012;
		
		System.out.println("Avião: Boeing");
		System.out.println("Envergadura: " + boeing.envergadura);
		System.out.println("Cor: " + boeing.cor);
		System.out.println("Ano: " + boeing.ano);
		
		boeing.ligar();
		boeing.acelerar();
		boeing.aterrizar();
		boeing.desligar();

	}

}
