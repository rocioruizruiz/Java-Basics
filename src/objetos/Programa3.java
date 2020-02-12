package objetos;
import java.util.ArrayList;
import java.util.List;

public class Programa3 {
	
	/*
	 * Arrays dinamicos(ArrayList, Vector) for para todo
	 */
	public static String personasAño(List<Persona> lista, int año) {
		String s = "";
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getAnio() == año) {
				s = s + lista.get(i).getNombre() + "\n";
			}
		}
		return s;
	}
		
	public static void main(String[] args) {
		List<Persona> amigos = new ArrayList<Persona>();
		
		amigos.add(new Persona("1", "Carlos", "Martin", 20, 4, 1993, "7657643897"));
		amigos.add(new Persona("2", "Marcos", "Martin", 21, 4, 1992, "7657643897"));
		amigos.add(new Persona("3", "Bruno", "Martin", 22, 4, 1991, "7657643897"));
		amigos.add(new Persona("4", "Maria", "Martin", 23, 4, 1990, "7657643897"));
		amigos.add(new Persona("5", "Agus", "Martin", 24, 4, 1989, "7657643897"));
		amigos.add(new Persona("6", "Jorge", "Martin", 25, 4, 1988, "7657643897"));
		amigos.add(new Persona("7", "Bastian", "Martin", 26, 4, 1987, "7657643897"));
		amigos.add(new Persona("8", "Mathew", "Martin", 27, 4, 1986, "7657643897"));
		
		//recorrido de la lista mis amigos utilizando for 'para-todo'
		System.out.println("\nMis amigos\n");
		for(Persona p : amigos)
			System.out.println(p.getNombre());
		//si fuera array es length como propiedad del array
		/*
		System.out.println("\nMis amigos\n");
		for(int i = 0; i<amigos.length; i++) {
			System.out.println(amigos[i].getNombre());
		}
		*/
		//Para List es .size()
		for(int i = 0; i<amigos.size(); i++) {
			System.out.println(amigos.get(i).getNombre());
		}

		System.out.println("---------------------");
		System.out.println(personasAño(amigos, 1991));
		System.out.println(personasAño(amigos, 1992));
		
		List<Persona> clase = new ArrayList<Persona>();
		clase.add(new Persona("1", "Carlos", "Martin", 20, 4, 1993, "7657643897"));
		clase.add(new Persona("1", "Carlos", "Martin", 20, 4, 1992, "7657643897"));
		clase.add(new Persona("1", "Carlos", "Martin", 20, 4, 1993, "7657643897"));
		clase.add(new Persona("1", "Carlos", "Martin", 20, 4, 1993, "7657643897"));
		
		System.out.println("\nMis amigos\n");
		for(Persona p : clase)
			System.out.println(p.getNombre());
		System.out.println(personasAño(clase, 1993));
		
	}
	
}

