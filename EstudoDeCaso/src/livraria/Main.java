package livraria;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bem-vindo à livraria FIAP. Realize seu cadastro.");
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu login: ");
		String login = leitor.nextLine();
		
		System.out.println("Digite sua senha: ");
		String senha = leitor.nextLine();
		
		System.out.println("Digite seu CEP: ");
		String cep = leitor.nextLine();
		
		System.out.println("Digite sua rua: ");
		String rua = leitor.nextLine();
		
		System.out.println("Digite o número: ");
		int numero = leitor.nextInt();
		
		leitor.nextLine();
		
		Endereco endereco = new Endereco(cep, rua, numero);
		Cliente cliente = new Cliente(login, senha, endereco);
		
/////////////////////////////////////////////////////////////////////////////
		
		System.out.println("Bem vindo " + cliente.getLogin() + "!");
		
		System.out.println("Digite seu login: ");
		String validarLogin = leitor.nextLine();
		
		System.out.println("Digite sua senha: ");
		String validarSenha = leitor.nextLine();
		
		if(cliente.login(validarLogin, validarSenha)) {
		////////
			Livro l00 = new Livro("Imperfeitos", 15.47);
			Livro l01 = new Livro("A Biblioteca da Meia-Noite", 45.50);
			Livro l02 = new Livro("Lei das Sociedades Anônimas Vol.2", 400);					
			
			ArrayList<Livro> livros = new ArrayList<>();
			livros.add(l00);
			livros.add(l01);
			livros.add(l02);
		////////
			
			System.out.println("Estas são as nossas opcões de livros:\n");
			int indiceDoLivro = 0;
			for(Livro l : livros) {
				System.out.println(indiceDoLivro + "'" + l.getTitulo() + "' " + "- Preço: R$" + l.getPreco());
				indiceDoLivro++;
			}
			
			System.out.println("\nDigite o número que corresponde ao livro que deseja adicionar ao carrinho:");
			int numeroDoLivro = leitor.nextInt();
			Livro livroSelecionado = livros.get(numeroDoLivro);
			
			System.out.println("O preço do livro " + livroSelecionado.getTitulo() + " é de " + livroSelecionado.getPreco());
			System.out.println("Adicionado ao carrinho com sucesso e chegará em breve no endereço cadastrado.");
		}
			else {
			System.out.println("Não foi possível acessar a Livraria: Login ou senha inválidos.");
		}
		
		leitor.close();
	}
}
