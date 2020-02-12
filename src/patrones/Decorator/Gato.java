package patrones.Decorator;

public class Gato extends Mascota {
	
	public Gato(String nombre) {
		super(nombre);
	}
	
	@Override
	public String getCaracteristicas() {
		return "Soy un gato, hago miau y me llamo " + super.getNombre();
	}
}
