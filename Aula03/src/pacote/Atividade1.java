package pacote;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner calculadora = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		int x = calculadora.nextInt();
		
		System.out.println("Digite o segundo número:");
		int y = calculadora.nextInt();
		
		System.out.println("Digite o terceiro número:");
		int z = calculadora.nextInt();
		
		calculadora.close();
		
		System.out.println("Resultado da média:");
		double media = (x + y + z) / 3;
		System.out.println("R:" + media);
		
		System.out.println("Resultado da multiplicação:");
		int multipli = (x * y * z);
		System.out.println("R:" + multipli);
	}
}
