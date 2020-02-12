package patrones.Decorator;

/*
 * El patron Decorator añade funcionalidad a una clase de forma dinamica
 */

public class Programa {
	
	public static void main(String[] args) {
		
		Mascota gato = new Gato("Felix");
		Mascota perro = new Perro("Golfo");
		
		System.out.println(perro.getCaracteristicas());
		System.out.println(gato.getCaracteristicas());
		
		Mascota perroNadador = new Nadador(perro);
		System.out.println(perroNadador.getCaracteristicas());
		
		Mascota perroSaltador = new Saltador(perro);
		System.out.println(perroSaltador.getCaracteristicas());
		
		Mascota perroNadadorYSaltador = new Saltador(perroNadador);
		System.out.println(perroNadadorYSaltador.getCaracteristicas());
		
		Mascota gatoNadador = new Nadador(new Gato("Silvestre"));
		System.out.println(gatoNadador.getCaracteristicas());
		
		// Mascota perroNadador = new Nadador(perro);
		
		
	}

}
