package pacote;

public class Cliente {

	String login;
	String senha;
	Endereco endereco;
	
	public Cliente(String login, String senha, Endereco endereco) {
		this.login = login;
		this.senha = senha;
		this.endereco = endereco;
	}
	
	boolean Login(String login, String senha) {
		if(this.login.equals(login) && this.senha.equals(senha)) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	String getLogin() {
		return login;
	}
}
