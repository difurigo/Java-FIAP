package dominio;

public class Correntista {
	
	private String nome;
	private String cpf;
	
	public Correntista(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void transferencia(double valor, ContaCorrente contaSacada, ContaCorrente contaDepositada) {
		
	}
	
	public void alterarNome(String novoNome) {
		
	}
}
