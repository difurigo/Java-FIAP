package dominio;

public class Gerente extends Funcionario {

	public Gerente(String nome, String matricula, double salarioBase) {
		super(nome, matricula, salarioBase);
	}
	
	public double calculaSalario() {
		return salarioBase * 2;
	}
}
