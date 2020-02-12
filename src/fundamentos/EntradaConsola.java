package fundamentos;
import java.util.Scanner;

public class EntradaConsola {
	
	public static void main(String[] args) {
		Scanner entradaConsola = new Scanner(System.in);
		System.out.println("Como te llamas? ");
		
		String nombre = entradaConsola.nextLine();
		System.out.println("Cual es tu numero favorito? ");
		
		int numero = entradaConsola.nextInt();
		
		System.out.println("Hola " + nombre + ", tu numero favorito es el " + numero + "!");
		
		entradaConsola.close();
	}

}
