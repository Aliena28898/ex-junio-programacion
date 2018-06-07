package org.mvpigs.commandpattern.procesadores;

import interfaces.Pedido;
import interfaces.TratamientoPedido;

public class Oficina {

	public boolean procesa(TratamientoPedido tratamientoInt) {
		// TODO Auto-generated method stub
		return false;
	}

	public String printarStatus(boolean procesa, Pedido pedido) {
		// TODO Auto-generated method stub
		if(procesa) {
			return("El pedido con destino "+pedido.destino()+" y peso "+pedido.peso()+" ha sido aceptado.");
		}
		else {
			return("El pedido con destino "+pedido.destino()+" y peso "+pedido.peso()+" ha sido rechazado.");
		}
	}

}
