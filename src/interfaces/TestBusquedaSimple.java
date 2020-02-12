package interfaces;

public class TestBusquedaSimple {

	public static void main(String[] args) {
		String [] nombres1 = {"Maria", "Ana", "Jorge" , "Marcos"};
		Object [] claves1 = {10,20,30,40};
		
		BusquedaSimple b1 = new BusquedaSimple(nombres1, claves1);
		
		System.out.println("La clave de Jorge es: " + b1.existe("Jorge"));
		System.out.println("La clave de Ana es: " + b1.existe("Ana"));
		System.out.println("La clave de Maria es: " + b1.existe("Maria"));
		System.out.println("La clave de Marcos es: " + b1.existe("Marcos"));
		
		String [] nombres2 = {"Maria", "Ana", "Jorge" , "Marcos"};
		Object [] claves2 = {'a','b','c','d'};
		
		BusquedaSimple b2 = new BusquedaSimple(nombres2, claves2);
		
		System.out.println("La clave de Jorge es: " + b2.existe("Jorge"));
		System.out.println("La clave de Ana es: " + b2.existe("Ana"));
		System.out.println("La clave de Maria es: " + b2.existe("Maria"));
		System.out.println("La clave de Marcos es: " + b2.existe("Marcos"));

	}

}
