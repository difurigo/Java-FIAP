package livraria;

public class Livro {

	String titulo;
	double preco;
	
	public Livro(String titulo, double preco) {
		this.titulo = titulo;
		this.preco = preco;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public double getPreco() {
		return preco;
	}
}
