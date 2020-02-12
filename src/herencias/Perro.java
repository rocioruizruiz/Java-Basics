package herencias;

public class Perro extends Mascota{
	

	private String tamaño;
	
	public Perro(String nombre, char genero, String color, String raza, int añoNacimiento, String tamaño) {
		super(nombre, genero, color, raza, añoNacimiento);
		this.tamaño = tamaño;
	}
	public String getTamaño() {
	// devuelve el tamaño del objeto Perro
		return this.tamaño;
	}
	public String getDatos() {
	// devuelve todos los datos almacenados del objeto Perro
		String datos = "Nombre: " + this.getNombre() +"\nGenero: " + this.getGenero() +"\nColor: " + this.getColor() +"\nRaza: " + this.getRaza() +"\nAño de nacimiento: " + this.getAñoNacimiento() +"\nTamaño: " + this.getTamaño() + "\n----------------------\n";
		return datos;
	}
	
}
