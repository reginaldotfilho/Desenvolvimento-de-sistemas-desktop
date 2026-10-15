package array;

public class Array1 {

	public static void main(String[] args) {
		//Indice           0       1        2       3
		String[] nomes = {"Bill","José", "Bruce", "Frank"};
		// recuperando o nome Bruce
		System.out.println(nomes[2]);
		//Tamanho do array
		System.out.println(nomes.length);
		//percorrendo o array com uso do laço FOR
		for(int i=0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
	}

}
