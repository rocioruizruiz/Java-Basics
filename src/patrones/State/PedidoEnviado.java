package patrones.State;

public class PedidoEnviado implements EstadoPedido { 
	@Override
	public void siguiente(Pedido p) {
		p.setEstado( new PedidoEntregado() );
	}
	@Override
	public void anterior(Pedido p) {
		p.setEstado( new PedidoPreparado() ); }
	@Override
	public String descripcion() {
		return "Pedido enviado al cliente"; }
}