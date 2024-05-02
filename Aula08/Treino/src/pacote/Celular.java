package pacote;

public class Celular {

	String marca;
	double preco;
	
	public Celular(String marca, double preco) {
		this.marca = marca;
		this.preco = preco;
	}
	
	String getMarca() {
		return marca;
	}
	
	double getPreco() {
		return preco;
	}
}
