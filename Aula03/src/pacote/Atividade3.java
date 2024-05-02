package pacote;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner AntSuc = new Scanner(System.in);
		
		System.out.println("Digite o número:");
		int x = AntSuc.nextInt();
		
		AntSuc.close();
		
		int ant = (x - 1);
		int suc = (x + 1);
		
		System.out.println("Seu antecessor é: " + ant);
		System.out.println("Seu sucessor é: " + suc);		
	}
}
