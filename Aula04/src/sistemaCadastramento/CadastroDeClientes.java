package sistemaCadastramento;

import java.util.Scanner;

public class CadastroDeClientes {
	public static void main(String[] args) {
		Scanner cadastro = new Scanner(System.in);
		
		System.out.println("Digite o nome do usuário: ");
		String nome = cadastro.nextLine();
		
		System.out.println("Digite o sexo do usuário: ");
		char sexo = cadastro.next().charAt(0);
		
		System.out.println("Digite a idade do usuário: ");
		int idade = cadastro.nextInt();
		
		System.out.println("Digite se o usuário é casado: ");
		boolean casado = cadastro.nextBoolean();
		
		System.out.println("Digite o salário do usuário: ");
		double salario = cadastro.nextDouble();
		
		cadastro.close();
		
	Usuario usuario01 = new Usuario(nome, sexo, idade, casado, salario);
	Usuario usuario02 = new Usuario("Diego Furigo do Nascimento", 'M', 18, false, 5400.30);
	
	usuario01.exibir();
	usuario02.exibir();
	
	}
}
