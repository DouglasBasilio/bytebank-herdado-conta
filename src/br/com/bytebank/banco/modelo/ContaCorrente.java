package br.com.bytebank.banco.modelo;
//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	// Anotação na configuração, sobreescreer método
	// reaproveitamento de código
	public void saca(double valor) {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	// adicionado esboço do método
	public void deposita(double valor) {
		super.saldo += valor;

	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
