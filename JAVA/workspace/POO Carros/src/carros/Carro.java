package carros;

import java.util.Random;

public class Carro {
	
	int ano;
	String cor;
	
	//construtor
	public Carro() {
		System.out.println("_________________________");
		//Exemplo de gerador de caracteres aleatórios
		String chassi = new String("123456789ABCDEF");
		Random gerador = new Random();
		System.out.print("Chassi: * ");
		for (int i = 1; i < 16; i++) {
			//obter 15 Números da String Chassi
			//char numeracao (criar uma variável que armazena 1 caractere)
			//(char) -> casting faz conversão para char
			// gerador.nesstInt(chassi.length()); sorteio de um valor String
			// chassi.charAT(numeracao) -> exibe o caractere sorteado
			char numeracao = (char) gerador.nextInt(chassi.length());
			System.out.print(chassi.charAt(numeracao));
		}
		System.out.println(" *");
	}
	
	/*
	public Carro() {
		System.out.println("          ________");
		System.out.println("        /     /    \\");
		System.out.println(" ______/_____/______\\");
		System.out.println("[0[\\\\[0[___  | -  ___|");
		System.out.println("\\_____|/, \\|____|/, \\/");
		System.out.println("  \\_ \\\\__/    \\\\__/ ");
	} */
	
	void ligar() {
		System.out.println("Motor ligado");
	}
	void desligar() {
		System.out.println("Motor Desligado");
	}
	void acelerar() {
		System.out.println("Pisando no acelerador");
	}
	

}
