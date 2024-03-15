package banco;

public class ContaCorrente {

	double saldo;
	
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}
	
	void saque(double valor) {
		if(valor > saldo) {
			System.out.println("Não é possível realizar saque: Valor indisponível para saque.");
		}
		
		else {
			saldo = saldo - valor;
		}
	}
	
	void deposito(double valor) {
		if(valor <= 0) {
			System.out.println("Não é possível realizar depósito: Valor não considerável.");
		}
		
		else {
		saldo = saldo + valor;
		}
	}
	
	double saldo() {
		return saldo;
	}
	
	void render() {
		saldo = saldo * 1.01;
	}
}
