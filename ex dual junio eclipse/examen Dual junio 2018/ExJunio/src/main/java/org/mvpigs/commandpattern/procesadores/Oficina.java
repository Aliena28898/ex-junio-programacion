package org.mvpigs.commandpattern.procesadores;

import org.mvpigs.commandpattern.interfaces.Procesador;

import interfaces.Pedido;
import interfaces.TratamientoPedido;

public class Oficina implements Procesador {

	public boolean procesa(TratamientoPedido tratamientoInt) {
		if(tratamientoInt.tratar()) {
			return true;
		}
		else {
			return false;
		}
	}

	public String printarStatus(boolean procesa, Pedido pedido) {
		if(procesa) {
			return(pedido.destino()+" ACEPTADO");
		}
		else {
			return(pedido.destino()+" RECHAZADO");
		}
	}

}
