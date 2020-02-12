package patrones.State;

public interface EstadoPedido {

	public void siguiente(Pedido p);

	public void anterior(Pedido p);

	public String descripcion();

}