package interfaces;

import java.util.UUID;
/**
 * La interfaz Pedido implementa los metodos:
 * 
 * peso
 * @param 		void
 * @return      el peso del pedido
 * 
 * destino
 * @param 		void
 * @return 		el destino del pedido
 */

public interface Pedido {
	public int peso();
	public String destino();
	public UUID getId();
}
