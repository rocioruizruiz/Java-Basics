package protectora.file;

public class Gato extends Mascota { 
	private String caracter;
	
	public Gato(String nombre, char genero, String color, String raza, int añoNacimiento, String caracter) {
	// método constructor del objeto Gato 
		super(nombre, genero,color, raza, añoNacimiento);
		this.caracter = caracter;
	}
	
	public String getCaracter() {
	// devuelve el carácter del objeto Gato
		return this.caracter;
	}
	
	public String getDatos() {
	// devuelve todos los datos almacenados del objeto Gato
		String datos = "Nombre: " + this.getNombre() +"\nGenero: " + this.getGenero() +"\nColor: " + this.getColor() +"\nRaza: " + this.getRaza() +"\nAño de nacimiento: " + this.getAñoNacimiento() +"\nCaracter: " + this.getCaracter() + "\n----------------------\n";
		return datos;
	} 
}