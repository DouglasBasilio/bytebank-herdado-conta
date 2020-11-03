// A classe ainda existe, mas não pode mais criar um objeto dessa classe

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; // static é da classe, no caso class Conta

	// constructor
	public Conta(int agencia, int numero) {
		Conta.total++;
		// System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		// System.out.println("Estou criando a conta " + this.numero);
	}

	// Os filhos precisam implementar o método "deposita"
	public abstract void deposita(double valor);

	public void saca(double valor) {
		if (this.saldo < valor) {
			// problema
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) {
		// this.saca (chama o método saca)
		// só será possível depositar se o método saca() funcionar
		// caso não funcione, sairá desse método
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
			System.out.println("Não pode valor <= 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor menor igual a 0");
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

	// preciso falar que o método é da Classe através do static
	public static int getTotal() {
		return Conta.total;
	}
}