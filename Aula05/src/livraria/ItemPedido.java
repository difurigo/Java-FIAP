package livraria;

public class ItemPedido {

	String nomeProduto;
	double valorProduto;
	
	ItemPedido(String nomeProduto, double valorProduto) {
	this.nomeProduto = nomeProduto;
	this.valorProduto = valorProduto;
	}
	
	double valor() {
		return valorProduto;
	}
}
