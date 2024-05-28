package dominio;

public class ContaCorrente extends ContaSacavel implements ContaRentavel {
	
	public ContaCorrente(double saldo) {
		super(saldo);
	}

	@Override
	public void render(double porcentagem) {
		porcentagem += 1;
		saldo *= porcentagem;
	}
}
