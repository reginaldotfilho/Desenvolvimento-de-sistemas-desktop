package carros;

public class Garagem {

	public static void main(String[] args) {
		//Objeto 1
		Carro celta = new Carro(); 
			celta.ano = 2000;
			celta.cor = "Vermelho";
			
			System.out.println("Carro Celta");
			System.out.println("Ano: " + celta.ano);
			System.out.println("Cor: " +celta.cor);
			celta.ligar();
			
			
		//Objeto 2	
			Carro palio = new Carro(); 
			palio.ano = 1998;
			palio.cor = "Cinza";
			
			System.out.println("Carro Palio");
			System.out.println("Ano: " + palio.ano);
			System.out.println("Cor: " + palio.cor);
			palio.desligar();
			
	
		//Objeto 3
			
			Carro uno = new Carro();
			uno.ano = 1998;
			uno.cor = "Preto";
			
			System.out.println("Carro Uno");
			System.out.println("Ano: " + uno.ano);
			System.out.println("Cor: " + uno.cor);
			uno.acelerar();
			
		// Objeto 4 
			
			Carro camaro = new Carro();
			camaro.ano = 2012;
			camaro.cor = "Amarelo";
			
			System.out.println("Carro Camaro");
			System.out.println("Ano: " + camaro.ano);
			System.out.println("Cor: " + camaro.cor);
			camaro.ligar();
			
			
			
			

	}

}
