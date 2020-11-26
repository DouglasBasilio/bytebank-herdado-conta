package br.com.bytebank.banco.modelo;

//Tudo é abstrato dentro de uma interface
public interface Tributavel {
	// dentro de uma interface, tudo é público e abstrato
	// está implícito, não preciso digitar public abstract .....
	double getValorImposto();
}
