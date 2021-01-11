package br.com.bytebank.banco.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		// estrutura de dados
		// lista de contas
		// digo qual o tipo da lista, faço uma referência
		// não consegue add nada diferente de conta

		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		// classe é genérica, mas posso "tipificar"
		// isso é chamado de Generics
		// ArrayList<String> nomes = new ArrayLista<String>();
		
		Conta cc = new ContaCorrente(22, 11);		
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);		
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
		
		// não precisa do casting por conta da referência na lista
		// Conta ref = (Conta) lista.get(0);
		Conta ref = lista.get(0);
		System.out.println(ref);
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(33, 311);		
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(33, 422);		
		lista.add(cc4);
		
		for (int i = 0; i < lista.size(); i++) {
			Object conta = lista.get(i);
			System.out.println(conta);
		}
		
		System.out.println("---------");
		
		//For Each
		//Para cada elemento do tipo Object desta lista, queremos que seja impresso o seu valor:
		for (Object conta : lista) {
			System.out.println(conta);
		}
	}

}
