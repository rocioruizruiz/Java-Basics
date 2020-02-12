package red;
import java.util.Vector;

public class Red {
	
	private String nombre;
	private Vector<Persona> personas;
	
	public void mostrarPersonas() {
		System.out.println("Personas en la red: " + this.nombre + "\n");
		for(Persona p: this.personas)
			System.out.println(p.getDatos());
	}
	public Red(String nombre) {
		this.nombre = nombre;
		this.personas = new Vector<Persona>();
	}
	public void añadirPersonas(Persona p) {
		this.personas.add(p);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
