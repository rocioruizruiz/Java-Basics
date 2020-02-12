package patrones.Observer;

public class Pantalla implements Observer{ 
	
	//LA PANTALLA ES EL OBSERVER(CADA PANTALLA). 
	private String nombre;
	
	public Pantalla(String nombre) { 
		this.nombre = nombre;
	}

	@Override
	public void actualizar(String nombre , String mensaje) {
		
		System.out.println("\t" + this.nombre + " <- [" + nombre + "] " + mensaje); 
	}
	
	public String getNombre() { 
		return this.nombre;
	} 
}