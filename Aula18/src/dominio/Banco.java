package dominio;

import java.util.ArrayList;

public class Banco {

	public void renderContas(ArrayList<ContaRentavel> contasRentaveis) {
		for(ContaRentavel conta : contasRentaveis) {
			conta.render(1);
		}
	}
	
	public void realizarDepositos(double valor, ArrayList<ContaPadrao> contas) {
		for(ContaPadrao conta : contas) {
			conta.depositar(valor);
		}
	}
}
