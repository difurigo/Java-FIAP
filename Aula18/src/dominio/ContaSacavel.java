package dominio;

public abstract class ContaSacavel extends ContaPadrao {

	public ContaSacavel(double saldo) {
		super(saldo);
	}
	
	public void sacar(double saque) {
		if(saldo < saque) {
			throw new IllegalArgumentException("Falha ao realizar saque: Valor do saque maior que o saldo atual.");
		} else {
			saldo -= saque;
		}
	}
}
