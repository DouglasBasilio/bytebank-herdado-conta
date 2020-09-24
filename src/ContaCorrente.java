//new ContaCorrente()
public class ContaCorrente extends Conta {
	
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	// Anota��o na configura��o, sobreescreer m�todo
	//reaproveitamento de c�digo
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	// adicionado esbo�o do m�todo
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
}
