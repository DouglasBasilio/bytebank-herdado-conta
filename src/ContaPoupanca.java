
public class ContaPoupanca extends Conta {
	// Construtores n�o s�o herdados, 
	// ent�o precisa reescrever nossos construtores
	// fazemos a chamada via SUPER
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
}
