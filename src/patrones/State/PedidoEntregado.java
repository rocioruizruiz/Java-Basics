package patrones.State;

public class PedidoEntregado implements EstadoPedido { 
		
	@Override
	public void siguiente(Pedido p) {}
	
	@Override
	public void anterior(Pedido p) {
		p.setEstado( new PedidoEnviado()); 
	}
	
	@Override
	public String descripcion() {
		return "Pedido entregado al cliente"; 
	}
	
}