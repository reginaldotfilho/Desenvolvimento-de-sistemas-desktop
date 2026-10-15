package minecraft;

public class Bloco {
	
	//atributos
	int resistencia;
	String textura;
	
	// construtor (injelçai(construção) de código ao criar o objeto)
	// para criar o construtor usamos o mesmo nome da classe sem o class
	public Bloco() {
		System.out.println("________________________________________________________");
	}
	
	//métodos (funções)
	void construir() {
		System.out.println("Bloco colocado");
	}
	
	void minerar() {
		System.out.println("Recusrsos obtidos");
	}
	
	void craftar() {
		System.out.println("Item criado");
	}
	
}
