package interfaces;

import interfaces.Pedido;

/**
 * La interfaz PedidoPeligroso implementa el metodo:
 * 
 * instrucciones
 * @param   void
 * @return  String
 * 
 * Hereda de la interfaz Pedido
 */

public interface PedidoPeligroso extends Pedido {

     String instrucciones();

}
