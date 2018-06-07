package org.mvpigs.commandpattern.pedidos;
import java.util.UUID;

import interfaces.Pedido;

public class PedidoInternacional implements Pedido{
	private String destino;
	private int peso;
	private UUID id;
	
	public PedidoInternacional(String destino, int peso) {
		this.destino = destino;
		this.peso = peso;
		this.id = UUID.randomUUID();
	}

	@Override
	public int peso() {
		// TODO Auto-generated method stub
		return this.peso;
	}

	@Override
	public String destino() {
		// TODO Auto-generated method stub
		return this.destino;
	}

	@Override
	public UUID getId() {
		return this.id;
	}

}
