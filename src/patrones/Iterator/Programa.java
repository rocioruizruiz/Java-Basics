package patrones.Iterator;
import java.util.ListIterator; import java.util.Vector;
public class Programa {
	public static void main(String[] args) { 

		Vector<String> vocales = new Vector<String>();
		vocales.add("a"); 
		vocales.add("e"); 
		vocales.add("i"); 
		vocales.add("o");
		vocales.add("u");

		ListIterator<String> iterador = vocales.listIterator(); //funcion para recorrer el vector
		while(iterador.hasNext()) { 
			System.out.println(iterador.next());
		}

		System.out.println("");

		while(iterador.hasPrevious()) { 
			System.out.println(iterador.previous());
		} 
	}
}