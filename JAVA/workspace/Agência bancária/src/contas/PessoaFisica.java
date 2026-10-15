package contas;



public class PessoaFisica {

	public static void main(String[] args) {
		//Objeto 1
		Conta cc1 = new Conta();
		cc1.setCliente("Reginaldo");
		cc1.setSaldo(45000);
		System.out.println("CLiente: "+ cc1.getCliente());
		cc1.exibirSaldo();
		cc1.sacar(1000);
		cc1.exibirSaldo();
		System.out.println("-------------------------------------");
		
		//Objeto 2
		
		Conta cc2 = new Conta();
		cc2.setCliente("Ronaldo");
		cc2.setSaldo(30000);
		System.out.println("Cliente: "+ cc2.getCliente());
		cc2.exibirSaldo();
		cc2.depositar(1000);
		cc2.exibirSaldo();
		System.out.println("--------------------------------------");
		
		//trasferência (reginaldo => ronaldo (2000.00)
		System.out.println("Transferência");
		System.out.println("Cliente: "+ cc1.getCliente());
		System.out.println("Favorecido: " + cc2.getCliente());
		cc1.transferir(cc2, 2000);
		System.out.println("");
		System.out.println("Cliente: "+ cc1.getCliente());
		cc1.exibirSaldo();
		System.out.println("Cliente: "+ cc2.getCliente());
		cc2.exibirSaldo();
		System.out.println("--------------------------------------------------------");
		System.out.println("Relatório gerencial");
		Conta gerente = new Conta();
		//a linha abaixo criar uma variável que armazena o resultado (retorno) da função soma (cc1, cc2)
		double relatorio = gerente.soma(cc1.getSaldo(), cc2.getSaldo());
		System.out.println("Saldo total nas contas: R$  " + relatorio);

	}

}
