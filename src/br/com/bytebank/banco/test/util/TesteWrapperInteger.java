package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		// array tipo primitivo
		int[] idades = new int[5];
		
		// array para guardar referências
		String[] nomes = new String[5];
		
		int idade = 29; // primitivo | Integer		
		Integer idadeRef = Integer.valueOf(idade); //autoboxing
		
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		int valor = idadeRef.intValue(); //unboxing
		System.out.println(valor);
		
		// coleções de referências
		List<Integer> numeros = new ArrayList<Integer>();
		
		// idade não é referência, não é compativel com o tipo Object
		// para cada tipo primitivo, existe uma classe que representa o tipo primitivo
		numeros.add(idade);
		numeros.add(31); // Autoboxing (add um primitivo em uma lista de referências)
		//numeros.add(idadeRef);
		

		
	}

}
