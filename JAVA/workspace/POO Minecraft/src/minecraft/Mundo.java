package minecraft;

public class Mundo {

	public static void main(String[] args) {
		
		// objeto 1 Bloco de terra
		// a linha abaixo cria(instancia) um objeto
		Bloco blocoTerra = new Bloco();
		
		//atribuido valores aos atributos(variaveis) do Bloco
		blocoTerra.resistencia = 1;
		blocoTerra.textura = "Terra";
		System.out.println("Bloco: " + blocoTerra.textura);
		System.out.println("Resistencia: " + blocoTerra.resistencia);
		
		// uso méotdos da classe modelo Bloco
		blocoTerra.minerar();
		blocoTerra.construir();
		
		// objeto 2 Bloco de madeira
		Bloco blocoMadeira = new Bloco();
		blocoMadeira.resistencia  = 2;
		blocoMadeira.textura = "madeira";
		
		System.out.println("Bloco: " + blocoMadeira.textura);
		System.out.println("Bloco: " + blocoMadeira.resistencia);
		
		blocoMadeira.minerar();
		blocoMadeira.craftar();
	}

}
