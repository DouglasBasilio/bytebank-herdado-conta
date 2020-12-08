package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

// se um atributo esta como protected,
// s� ter� acesso a ele se extender a classe
// a classe ContaEspecial � filho

public class ContaEspecial extends Conta {
	
	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

}
