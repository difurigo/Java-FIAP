package dominio;

public class ContaCorrente {

	private double saldo;
	
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double saque) {
		if(saldo < saque) {
			throw new IllegalArgumentException("Falha ao realizar saque: Valor do saque maior que o saldo atual.");
		} else {
			saldo -= saque;
		}
	}
	
	public void depositar(double deposito) {
		if(deposito < 0) {
			throw new IllegalArgumentException("Falha ao realizar depósito: Valor do depósito inválido.");
		} else {
			deposito += saldo;
		}
	}
	
	public double exibirSaldo() {
		return saldo;
	}
	
	public void render(double porcentagem) {
		porcentagem += 1;
		saldo *= porcentagem;
	}
}
