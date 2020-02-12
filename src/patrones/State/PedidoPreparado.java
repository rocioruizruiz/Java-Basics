package patrones.State;

public class PedidoPreparado implements EstadoPedido { 
	@Override
	public void siguiente(Pedido p) { 
		p.setEstado( new PedidoEnviado() );
	}

	@Override
	public void anterior(Pedido p) {
		p.setEstado( new PedidoRecibido() ); 
	}

	@Override
	public String descripcion() {
		return " Pedido preparado, listo para enviar"; }
}