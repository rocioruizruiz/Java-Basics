package patrones.State;

public class PedidoRecibido implements EstadoPedido {
	@Override
	public void siguiente(Pedido p) { 
		p.setEstado( new PedidoPreparado() );
	}
	@Override
	public void anterior(Pedido p) { }

	@Override
	public String descripcion() {
		return "Pedido recibido, listo para su preparación"; 
	}
}