package array;

import java.util.ArrayList;

public class Array2 {

	public static void main(String[] args) {
		// a linha abaixo cria um vetor dinâmico
		ArrayList<String> contatos = new ArrayList<>();
		
		//ArrayList
		//.add (adicionar)
		// .get(recuperar)
		
		// adicionando dados a ovetor
		contatos.add("Bill Gates");
		contatos.add("1199999-1234");
		contatos.add("bill@outlook.com");
		contatos.add("Linus Tovalds");
		contatos.add("1199999-4567");
		contatos.add("linus@gmail.com");
		// recuperando os dados da lista
		for(int i = 0; i < contatos.size(); i++) {
			System.out.println(contatos.get(i));
		}

	}

}
