package dominio;

public class Assistente extends Funcionario {

	public Assistente(String nome, String matricula, double salarioBase) {
		super(nome, matricula, salarioBase);
	
	}
	
	public double calculaSalario() {
		return salarioBase;
	}
}
