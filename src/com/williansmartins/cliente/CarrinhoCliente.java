package com.williansmartins.cliente;

import java.rmi.Naming;

import com.williansmartins.interfaces.CarrinhoInterface;
import com.williansmartins.model.Item;

public class CarrinhoCliente {
	public static void main(String[] args) throws Exception {

		CarrinhoInterface carrinho;
		carrinho = (CarrinhoInterface) Naming.lookup("rmi://localhost:1099/farmacia/carrinho");

		Item item1 = new Item();
		item1.setNome("diazepam"); 
		item1.setPreco(35.0);

		Item item2 = new Item();
		item2.setNome("gardenal"); 
		item2.setPreco(96.0);

		carrinho.cadastrarItem(item1);
		carrinho.cadastrarItem(item2);

		System.out.println("local: " + carrinho.obterQuantidadeItens());
	}
}
