package br.com.bytebank.banco.modelo;

//Tudo � abstrato dentro de uma interface
public interface Tributavel {
	// dentro de uma interface, tudo � p�blico e abstrato
	// est� impl�cito, n�o preciso digitar public abstract .....
	double getValorImposto();
}
