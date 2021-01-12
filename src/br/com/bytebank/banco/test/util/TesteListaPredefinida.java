package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

public class TesteListaPredefinida {

	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList(26); //capacidade inicial
		lista.add("RJ");
		lista.add("SP");
		//outros estados
		ArrayList nova = new ArrayList(lista); //criando baseado na primeira lista
		
		System.out.println(nova.get(0));
	}

}
