package patrones.Decorator;

public abstract class Mascota {
	private String nombre;
	
	public Mascota() {}
	
	public Mascota(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public abstract String getCaracteristicas();
}
