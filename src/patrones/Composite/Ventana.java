package patrones.Composite;

import java.util.Vector;
public class Ventana extends Componente {
	private Vector<Componente> componentes = new Vector<Componente>();
	public void agrega(Componente componente){ 
		this.componentes.add(componente);
	}
	@Override
	public void desplaza(int dx, int dy) {
		System.out.println ("\nDesplazando la ventana (" + dx + ", " + dy + ")\n");
		for (Componente c : this.componentes) c.desplaza(dx, dy);
	} 
}