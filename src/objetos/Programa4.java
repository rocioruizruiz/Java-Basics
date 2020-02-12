package objetos;
import java.util.Vector;

public class Programa4 {

	/*
	 * Listas (La clase Vector)
	 */
	public static void main(String[] args) {
		Vector<Persona> vecinos = new Vector<Persona>();
		
		vecinos.add(new Persona("1", "Carlos", "Martin", 20, 4, 1993, "7657643897"));
		vecinos.add(new Persona("2", "Caro", "Martin", 20, 4, 1992, "7656797"));
		vecinos.add(new Persona("3", "Carl", "Martin", 20, 4, 1993, "7657456797"));
		
		System.out.println("Mis vecinos\n");
		
		for(Persona p: vecinos) 
			System.out.println(p.getDatos());
		
		
		
		
		
	}
}
