package dominio;

public abstract class Funcionario {
	
	protected String nome;
	protected String matricula;
	protected double salarioBase;
	
	public Funcionario(String nome, String matricula, double salarioBase) {
		this.nome = nome;
		this.matricula = matricula;
		this.salarioBase = salarioBase;	
	}
	
	public double calculaSalario() {
		return salarioBase;
	}
	
	public String exibirFolhaSalarial() {
		return "Nome: " + nome + " - Salário: " + calculaSalario();
	}
	
}
