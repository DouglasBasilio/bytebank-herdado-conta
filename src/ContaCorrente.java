//new ContaCorrente()
public class ContaCorrente extends Conta {
	
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	// Anotação na configuração, sobreescreer método
	//reaproveitamento de código
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	// adicionado esboço do método
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
}
