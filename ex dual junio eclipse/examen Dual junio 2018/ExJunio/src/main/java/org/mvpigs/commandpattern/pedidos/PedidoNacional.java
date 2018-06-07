package org.mvpigs.commandpattern.pedidos;
import java.util.UUID;

import interfaces.Pedido;

public class PedidoNacional implements Pedido{

	private String destino;
	private int peso;
	private UUID id;
	
	public PedidoNacional(String destino, int peso) {
		this.destino = destino;
		this.peso = peso;
		this.id = UUID.randomUUID();
	}

	@Override
	public int peso() { 
		return peso;
	}

	@Override
	public String destino() {
		return destino;
	}

	@Override
	public UUID getId() {
		return id;
	}

}
