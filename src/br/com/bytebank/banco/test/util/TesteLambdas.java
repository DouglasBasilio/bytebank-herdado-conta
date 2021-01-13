package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteLambdas {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();
		nomes.add("Super Mario");
		nomes.add("Yoshi"); 
		nomes.add("Donkey Kong"); 

		Collections.sort(nomes, (s1, s2) -> s1.length() - s2.length());
		nomes.sort((s1, s2) -> s1.length() - s2.length());

		nomes.forEach((nome) -> System.out.println(nome));



	}

}
