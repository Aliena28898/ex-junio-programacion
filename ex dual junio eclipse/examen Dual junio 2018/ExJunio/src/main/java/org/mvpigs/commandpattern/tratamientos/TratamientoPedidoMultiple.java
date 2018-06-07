package org.mvpigs.commandpattern.tratamientos;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Set;
import java.util.List;

import interfaces.Pedido;

public class TratamientoPedidoMultiple {
	//private Set pedidos;
	private ArrayList<Pedido> pedidos;
	private int bultos;
	private int pesoTotal;
	
	public int getNumBultos() {
		return this.bultos;
	}
	public int getPesoTotal() {
		return this.pesoTotal;
	}
	
	//public TratamientoPedidoMultiple(Set pedidos) {
	public TratamientoPedidoMultiple(ArrayList pedidos) {
		this.pedidos = pedidos;
	}

	public void calcularTotalBultos() {
		this.bultos = pedidos.size();
		
	}

	

	public void calcularPesoTotal() {
		Iterator<Pedido> iterator = pedidos.iterator();
		int pesoTotal = 0;
		while(iterator.hasNext()) {
			Pedido pedido = (Pedido) iterator.next();
			pesoTotal += pedido.peso();
		}
		this.pesoTotal = pesoTotal;
	
	}

	public boolean tratar() {
		this.calcularPesoTotal();
		this.calcularTotalBultos();//(por si acaso no se hace en el main/test)
		
		if((this.getPesoTotal()>0)&&(this.getNumBultos()==this.pedidos.size())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
