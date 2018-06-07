package org.mvpigs.commandpattern.pedidos;
import interfaces.Pedido;

public class PedidoInternacional implements Pedido{
	private String destino;
	private int peso;
	
	public PedidoInternacional(String destino, int peso) {
		this.destino = destino;
		this.peso = peso;
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

}
