
public class ContaPoupanca extends Conta {
	// Construtores não são herdados, 
	// então precisa reescrever nossos construtores
	// fazemos a chamada via SUPER
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
}
