package dominio;

public class Gerente extends Funcionario {

	private int quantidadeFuncionarios;
	
	public Gerente(String nome, String cpf, double salario, int quantidadeFuncionarios) {
		super(nome, cpf, salario);
		this.quantidadeFuncionarios = quantidadeFuncionarios;
		
	}
	
	public double lerBonificacao() {
		return salario * 0.15;
		
	}
}
