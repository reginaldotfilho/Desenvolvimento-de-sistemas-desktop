package array;

import java.util.Random;

public class Cartas {

	public static void main(String[] args) {
		String[] nipes = { "♠", "♥", "♦", "♣" };
		String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		// recuperar o Az de ouros
		//System.out.println(faces[0] + nipes[2]);
		
		// System.out.println(faces[11] + nipes[1]);
		
		// Criando um objeto para sorteio de uma carta
		
		Random sorteio = new Random();
		// alinha abaixo sortei um número aleatório entre 0 a 12
		int indiceFace = sorteio.nextInt(faces.length);
		
		// a linha abaixo sorteia um númeor aleatório entre 0 a 3
		int indiceNipe = sorteio.nextInt(nipes.length);
		
		System.out.println(faces[indiceFace] + nipes[indiceNipe]);

	}

}
