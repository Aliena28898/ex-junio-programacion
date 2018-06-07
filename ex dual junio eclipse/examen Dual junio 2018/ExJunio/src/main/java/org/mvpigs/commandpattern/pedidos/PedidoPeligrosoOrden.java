package org.mvpigs.commandpattern.pedidos;

import interfaces.PedidoPeligroso;

public class PedidoPeligrosoOrden implements PedidoPeligroso {

	private String destino;
	private String instrucciones;
	
	public PedidoPeligrosoOrden(String destino, String instrucciones) {
		this.destino = destino;
		this.instrucciones = instrucciones;
	}

	@Override
	public int peso() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String destino() {
		// TODO Auto-generated method stub
		return this.destino;
	}
	public String instrucciones() {
		return this.instrucciones;
	}

}
