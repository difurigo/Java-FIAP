package livraria;

import java.util.ArrayList;

public class Pedido {
	
	double valorTotal;
	ArrayList<ItemPedido> itensPedidos;
	
	Pedido(ArrayList<ItemPedido> itens){
		this.itensPedidos = itens;
	}
	
	double valor() {
		
		for (ItemPedido item : itensPedidos) {
			valorTotal += item.valor();
			
		}
		
		return valorTotal;
	}
}
