package banco;

import java.util.ArrayList;

import dominio.Banco;
import dominio.ContaCorrente;
import dominio.ContaDeEstudante;
import dominio.ContaPadrao;

public class Main {

	public static void main(String[] args) {

		Banco nuBanco = new Banco();

		//Contas corrente
		ContaPadrao conta00 = new ContaCorrente(1000);
		ContaPadrao conta01 = new ContaCorrente(500);

		//Contas de estudante
		ContaPadrao conta02 = new ContaDeEstudante(100);
		ContaPadrao conta03 = new ContaDeEstudante(250);

		//Lista de contas
		ArrayList<ContaPadrao> contas = new ArrayList<ContaPadrao>();
		contas.add(conta00);
		contas.add(conta01);
		contas.add(conta02);
		contas.add(conta03);
		
		//Depósito em todas as contas
		try {
			nuBanco.realizarDepositos(20, contas);

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		//Tentativa de ações individuais das contas
//		try {
//			conta00.sacar(250);
//			conta00.depositar(-3);
//
//			conta01.sacar(1000);
//			conta01.depositar(370);
//		} catch (IllegalArgumentException e) {
//			System.out.println(e.getMessage());
//		}

		for(ContaPadrao conta: contas) {
			System.out.println("Saldo da conta: " + conta + " - R$" + conta.exibirSaldo());
		}
	}
}
