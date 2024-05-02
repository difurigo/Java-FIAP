package pacote;

import java.util.ArrayList;
import java.util.Scanner;

import javax.security.auth.login.LoginContext;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bem-vindo ao e-commerce informática. Realize seu cadastro.");
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu login:");
		String login = leitor.nextLine();
		
		System.out.println("Digite sua senha:");
		String senha = leitor.nextLine();
		
		System.out.println("Digite seu CEP:");
		String cep = leitor.nextLine();
		
		System.out.println("Digite o nome da sua rua:");
		String rua = leitor.nextLine();
		
		System.out.println("Digite o número da sua residencia:");
		int numero = leitor.nextInt();
		leitor.nextLine();
		
		Endereco endereco = new Endereco(cep, rua, numero);
		Cliente cliente = new Cliente(login, senha, endereco);
////////////////
		System.out.println("Faça seu login para começar as compras!");
		System.out.println("Digite seu login:");
		String validarLogin = leitor.nextLine();
		
		System.out.println("Digite sua senha:");
		String validarSenha = leitor.nextLine();
////////////////	
		if(cliente.Login(validarLogin, validarSenha)) {
			System.out.println("Seja bem-vindo " + cliente.getLogin() + "!");
			System.out.println("Estas são nossas opções de produtos de informática:\n");
			
			Celular cel00 = new Celular("Xiaomi - Poco F5", 2399.99);
			Celular cel01 = new Celular("Apple - iPhone 15 mini", 5999.99);
			Celular cel02 = new Celular("Samsung - A34", 2500);
			Celular cel03 = new Celular("Xiaomi - Redmi Note 8", 989.90);
			
			ArrayList<Celular> celulares = new ArrayList<>();
			celulares.add(cel00);
			celulares.add(cel01);
			celulares.add(cel02);
			celulares.add(cel03);
			
			int indiceCelular = 0;
			for(Celular c : celulares) {
				System.out.println(indiceCelular + " Marca: " + c.getMarca() + " Preco: R$" + c.getPreco());
				indiceCelular++;
			}
			
			System.out.println("\nDigite o número correspondente ao celular que deseja:");
			int indiceEscolhido = leitor.nextInt();
			Celular celularEscolhido = celulares.get(indiceEscolhido);
					
			System.out.println("1 " + celularEscolhido.getMarca() + " foi adicionado ao seu carrinho!");
		}
		
		else {
			System.out.println("Não foi possível entrar na loja: Login ou senha inválidos.");
		}
	}
}