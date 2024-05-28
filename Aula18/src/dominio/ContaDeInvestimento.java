package dominio;

public class ContaDeInvestimento extends ContaPadrao implements ContaRentavel {

	private boolean encerrada;
	
	public ContaDeInvestimento(double saldo, boolean encerrada) {
		super(saldo);
		this.encerrada = encerrada = false;
	}

	@Override
	public void render(double porcentagem) {
		porcentagem += 1;
		saldo *= porcentagem;
	}
	
	public void liquidar() {
		encerrada = true;
	}

}
