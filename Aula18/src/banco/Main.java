package banco;

import java.util.ArrayList;

import dominio.ContaCorrente;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente conta00 = new ContaCorrente(1000);
		ContaCorrente conta01 = new ContaCorrente(500);
		
		try {
			conta00.sacar(250);
			conta00.depositar(-3);
			
			conta01.sacar(1000);
			conta01.depositar(370);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>();
		contas.add(conta00);
		contas.add(conta01);
		
		for(ContaCorrente conta: contas) {
			System.out.println("Saldo da conta: " + conta + ": R$" + conta.exibirSaldo());
		}
	}
}
