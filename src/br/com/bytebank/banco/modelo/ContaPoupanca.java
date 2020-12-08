package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {
	// Construtores n�o s�o herdados,
	// ent�o precisa reescrever nossos construtores
	// fazemos a chamada via SUPER
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	@Override
	public String toString() {
		return "Conta Poupan�a, " + super.toString();
	}
}
