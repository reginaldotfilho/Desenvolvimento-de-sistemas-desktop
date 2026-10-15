package contas;

public class Conta {
	// Atributos com encapsulamento (private)
	private double saldo;
	private String cliente;
	
	//métodos get e set para acessar as variáveis encapsuladas
	//Dica: botão direito -> source -> generate getters and setters

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	// construtor
	public Conta() {
		System.out.println("Agencia 0261");
	}

	// métodos
	protected void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}

	// Método (função) que calcula um valor (debitar do saldo)
	// está função recebe um valor quando "executada"
	void sacar(double valor) {
		saldo -= valor;
		System.out.println("Débito: R$" + valor);
	}

	void depositar(double valor) {
		saldo += valor;
		System.out.println("Crédito: R$ " + valor);
	}

	// transferência
	// conta destino (objeto)
	// valor (variável)
	// sacar conta oriogem - > depositar conta destino

	void transferir(Conta destino, double valor) {
		this.sacar(valor); // a própria conta de origem
		destino.depositar(valor);
		System.out.println("Transferência: R$ " + valor);
	}
	
	//Função que faz um cálculo e retorna um valor
	//Neste caso NÃO usamos a palavra void e o retorno
	//È OBRIGATÓRIO
	double soma(double cc1, double cc2) {
		double total = cc1 + cc2;
		return total;
	}
	
	
}
