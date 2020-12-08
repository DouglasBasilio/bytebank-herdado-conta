package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		// int[] idades = new int[5];
		
		ContaCorrente[] contas = new ContaCorrente[5];
		ContaCorrente cc1 = new ContaCorrente(33, 11);		
		contas[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(25, 22);
		contas[1] = cc2;
		
		//System.out.println(cc2.getNumero());
		System.out.println(contas[1].getNumero());
		System.out.println(contas[0].getNumero());
		
		//exception
		//System.out.println(contas[2].getNumero());
		
		ContaCorrente ref = contas[1];
		System.out.println(ref);
		//equivalente a
		System.out.println(cc2);

	}
}
