package dominio;

public abstract class ContaPadrao {
	
	protected double saldo;
	
	public ContaPadrao(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double deposito) {
		if(deposito <= 0) {
			throw new IllegalArgumentException("Falha ao realizar depósito: Valor do depósito inválido.");
		} else {
			saldo += deposito;
		}
	}
	
	public double exibirSaldo() {
		return saldo;
	}

}
