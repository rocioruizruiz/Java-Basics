package interfaces;

public class TestConjunto {

	public static void main(String[] args) {
		ConjuntoHashSet c1 = new ConjuntoHashSet();
		ConjuntoTreeSet c2 = new ConjuntoTreeSet();
		ConjuntoHashSet c3 = new ConjuntoHashSet();
		
		c1.insert("Maria");
		c1.insert("Marta");
		c1.insert("Marina");
		c1.insert("Mario");
		
		c2.insert("Maria");
		c2.insert("Jorge");
		c2.insert("Ana");
		c2.insert("Marcos");
		
		// ? es el operador ternario:  CONDICION + ?  + true : false.
		System.out.println("El conjunto c1 " + (c1.empty() ? "esta vacio" : "no esta vacio"));
		System.out.println("El conjunto c2 " + (c2.empty() ? "esta vacio" : "no esta vacio"));
		System.out.println("El conjunto c3 " + (c3.empty() ? "esta vacio" : "no esta vacio"));
		System.out.println("El conjunto c1 " + (c1.empty() ? "esta vacio" : "no esta vacio"));
		
		String nombre = "Maria";
		System.out.println(nombre + " " + ((c1.conteins(nombre)) ? "esté en c1" : "no esté en c1"));
		System.out.println(nombre + " " + ((c1.conteins(nombre)) ? "esté en c2" : "no esté en c2"));
		System.out.println(nombre + " " + ((c1.conteins(nombre)) ? "esté en c3" : "no esté en c3"));
		
		nombre = "Luis";
		
		System.out.println(nombre + " " + ((c1.conteins(nombre)) ? "esté en c1" : "no esté en c1"));
		System.out.println(nombre + " " + ((c2.conteins(nombre)) ? "esté en c2" : "no esté en c2"));
		System.out.println(nombre + " " + ((c3.conteins(nombre)) ? "esté en c3" : "no esté en c3"));
		
		nombre = "Marcos";
		
		System.out.println(nombre + " " + ((c1.conteins(nombre)) ? "esté en c1" : "no esté en c1"));
		System.out.println(nombre + " " + ((c2.conteins(nombre)) ? "esté en c2" : "no esté en c2"));
		System.out.println(nombre + " " + ((c3.conteins(nombre)) ? "esté en c3" : "no esté en c3"));
		
		c1.inicialize();
		
		System.out.println("El conjunto c1 " + ((c1.empty()) ? "esta vacio" : "no esta vacio"));
		System.out.println("El conjunto c2 " + ((c2.empty()) ? "esta vacio" : "no esta vacio"));
		System.out.println("El conjunto c3 " + ((c3.empty()) ? "esta vacio" : "no esta vacio"));
	}

}
