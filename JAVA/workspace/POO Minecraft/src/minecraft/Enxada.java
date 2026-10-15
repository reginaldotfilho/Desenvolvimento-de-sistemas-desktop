package minecraft;

//extends cria uma herança Enxada <------- Bloco
public class Enxada extends Bloco {
	
	//atibutos
	boolean conquista;
	
	//métodos
	void arar() {
		System.out.println("Terra preparada para o plantio!");
		conquista= true;
	}
	//Polimorfismo (Modifica um método existente na classe pai)
	//Obrigatoriamente o método precisa ter o mesmo nome
	void minerar() {
		System.out.println("Dano atribuido!");
	}
}
