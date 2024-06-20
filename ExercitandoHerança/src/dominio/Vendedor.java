package dominio;

public class Vendedor extends Funcionario {
	
	double comissao;

	public Vendedor(String nome, String matricula, double salarioBase, double comissao) {
		super(nome, matricula, salarioBase);
		this.comissao = comissao;
	}
	
	public double calculaSalario() {
		return salarioBase + comissao;
	}
}
