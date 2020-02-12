package genericos;

public class TipoGenerico<T> {
	private T valor;
	
	public TipoGenerico(T valor) {
		this.valor = valor;
	}
	
	public T getValor() {
		return this.valor;
	}
	
	public void setValor(T valor) {
		this.valor = valor;
	}
	
	public boolean esIgual(TipoGenerico<T> o) {
		return this.getValor().equals(o.getValor());
	}

}
