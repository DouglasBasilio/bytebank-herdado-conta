package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {
	// Construtores não são herdados,
	// então precisa reescrever nossos construtores
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
		return "Conta Poupança, " + super.toString();
	}
}
