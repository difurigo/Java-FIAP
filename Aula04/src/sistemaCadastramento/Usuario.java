package sistemaCadastramento;

public class Usuario {

	String nome;
	char sexo;
	int idade;
	boolean casado;
	double salario;
	
	public Usuario(String nome, char sexo, int idade, boolean casado, double salario) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.casado = casado;
		this.salario = salario;
	}
	void exibir() {
		System.out.println("As informações deste usuário são:\n"
				+ "Nome: " + nome + "\n"
				+ "Sexo: " + sexo + "\n"
				+ "Idade: " + idade + "\n"
				+ "Casado: " + casado + "\n"
				+ "Salário: " + salario + "\n");
	}
}
