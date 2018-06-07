package org.mvpigs.commandpattern.tratamientos;

import interfaces.PedidoPeligroso;
import interfaces.TratamientoPedido;

public class TratamientoPedidoPeligroso implements TratamientoPedido {
	private PedidoPeligroso pedido;
	
	public TratamientoPedidoPeligroso(PedidoPeligroso pedido) {
		this.pedido = pedido;
	}

	@Override
	public boolean tratar() {
		if (this.pedido.instrucciones().equals("no ponerselo en el dedo")) {
			return false;
		}
		else {
			return true;
		}
	}

}
