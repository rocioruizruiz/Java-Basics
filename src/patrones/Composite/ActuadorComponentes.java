package patrones.Composite;

public class ActuadorComponentes {
	public void desplaza(Componente componente, int dx, int dy) { 
		componente.desplaza(dx, dy);
	} 
}