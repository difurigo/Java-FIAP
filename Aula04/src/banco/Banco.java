package banco;

public class Banco {

	public static void main(String[] args) {
		ContaCorrente contaCorrente1 = new ContaCorrente(1000);
		ContaCorrente contaCorrente2 = new ContaCorrente(1200);
		
		//depositos
		contaCorrente1.deposito(-10);
		contaCorrente2.deposito(0.50);
		
		//saques
		contaCorrente2.saque(1300);
		contaCorrente1.saque(15);
		
		//rendimentos
		contaCorrente1.render();
		contaCorrente2.render();
		
		System.out.println("Saldo da Conta Corrente 1: " 
							+ contaCorrente1.saldo());
		
		System.out.println("Saldo da Conta Corrente 2: " 
							+ contaCorrente2.saldo());
		
	}
}
