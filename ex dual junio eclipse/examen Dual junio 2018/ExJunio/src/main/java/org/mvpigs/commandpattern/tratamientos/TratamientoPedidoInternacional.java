package org.mvpigs.commandpattern.tratamientos;

import org.mvpigs.commandpattern.pedidos.PedidoInternacional;

import interfaces.TratamientoPedido;

public class TratamientoPedidoInternacional implements TratamientoPedido {
	private PedidoInternacional pedido;
	public TratamientoPedidoInternacional(PedidoInternacional pedido) {
		this.pedido = pedido;
	}

	@Override
	public boolean tratar() {
		if(pedido.destino().equals("Mordor")) {
			return false;
		}
		else {
			return true;
		}
	}

}
