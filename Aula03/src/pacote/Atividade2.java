package pacote;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner ConsultarSalario = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = ConsultarSalario.nextLine();
		
		System.out.println("Digite seu salário atual:");
		double salario = ConsultarSalario.nextDouble();
		
		ConsultarSalario.close();
		
		double SalarioAlterado = (salario * 1.10);
		System.out.println("Olá " + nome + "! " + "Seu novo salário será de " + SalarioAlterado);
	}
}