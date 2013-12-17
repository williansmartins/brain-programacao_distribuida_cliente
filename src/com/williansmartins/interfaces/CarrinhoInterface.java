package com.williansmartins.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import com.williansmartins.model.Item;

public interface CarrinhoInterface extends Remote{
	void cadastrarItem(Item item) throws RemoteException;
	List<Item> obterItens() throws RemoteException;
	int obterQuantidadeItens() throws RemoteException;
}
