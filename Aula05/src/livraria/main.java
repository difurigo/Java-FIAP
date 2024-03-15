package livraria;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
	ItemPedido livro01 = new ItemPedido("Bíblia", 36.50);
	ItemPedido livro02 = new ItemPedido("Dinossarinhos para crianças", 17.90);
	ItemPedido livro03 = new ItemPedido("Star Wars - Saga Completa", 369.90);
	
	ArrayList<ItemPedido> itens = new ArrayList<>();
	itens.add(livro01);
	itens.add(livro02);
	itens.add(livro03);
	
	Pedido pedido = new Pedido(itens);
	
	System.out.println("O valor do pedido é: " + pedido.valor());
	}

}
