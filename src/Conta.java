// A classe ainda existe, mas n�o pode mais criar um objeto dessa classe

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; // static � da classe, no caso class Conta

	// constructor
	public Conta(int agencia, int numero) {
		Conta.total++;
		// System.out.println("O total de contas � " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		// System.out.println("Estou criando a conta " + this.numero);
	}

	// Os filhos precisam implementar o m�todo "deposita"
	public abstract void deposita(double valor);

	public void saca(double valor) {
		if (this.saldo < valor) {
			// problema
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) {
		// this.saca (chama o m�todo saca)
		// s� ser� poss�vel depositar se o m�todo saca() funcionar
		// caso n�o funcione, sair� desse m�todo
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("N�o pode valor <= 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("N�o pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	// preciso falar que o m�todo � da Classe atrav�s do static
	public static int getTotal() {
		return Conta.total;
	}
}