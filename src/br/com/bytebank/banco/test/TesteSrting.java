package br.com.bytebank.banco.test;

public class TesteSrting {

	public static void main(String[] args) {

		String vazio = "   Alura   ";
		String outroVazio = vazio.trim();
		
		System.out.println(vazio.contains("Alu"));
		System.out.println(outroVazio);
		System.out.println(outroVazio.isEmpty());
		
		String nome = "ALURA";
		CharSequence cs = new StringBuilder("al");

		nome = nome.replace("AL", cs);

		System.out.println(nome);
		
		
		//String nome = "Douglas"; // object literal
		//String outro = new String("Douglas");

		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
		
//		int pos = nome.indexOf("gl");
//		System.out.println(pos);
		
//		char c = nome.charAt(2);
//		System.out.println(c);
		
		//String outra = nome.replace("D", "d");
		
		//String outra = nome.toUpperCase();
		
		//System.out.println(nome);
		//System.out.println(outra);
	}

}
