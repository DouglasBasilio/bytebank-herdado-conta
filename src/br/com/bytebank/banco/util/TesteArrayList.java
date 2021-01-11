package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		// Generics
		List<Conta> lista = new ArrayList<Conta>(); //thread safe
		// ArrayList<Conta> lista = new ArrayList<Conta>();
		
		// List é interface
		
		Conta cc = new ContaCorrente(22, 11);		
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);		
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		//Saber se existe, se o array contém tal dado
		boolean existe = lista.contains(cc3);
		
		System.out.println("Já existe? " + existe);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}

}
