package patrones.State;

public class Pedido {
	private String id;
	private EstadoPedido estado;

	public Pedido(String id) {
		this.id = id;
		this.estado = new PedidoRecibido();
	}

	public String getId() { return this.id;
	}

	public String getEstado() {
		return "[Estado " + this.id + "] " + this.estado.descripcion();
	}

	public void setEstado(EstadoPedido estado) { 
		this.estado = estado;
	}
	public void estadoAnterior() { 
		this.estado.anterior(this);
	}
	public void estadoSiguiente() { 
		this.estado.siguiente(this);
	} 
}