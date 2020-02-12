package genericos;

import java.util.Vector;

public class TestPromedioVectorIntegerDouble {
	
	/*
	 * La clase abstracta number es la superclase de las superclases 
	 * 
	 * Un vector Number puede almacenar distinto tipos numericos, como integer o duble 
	 * para declarar un metodo generico que recibe como argumento cualquier subclase de Number se utiliza el caracter ? (wildcard),
	 * indicando que los elemntos del vector son instancias de las subclases de la superclase Number
	 */
	
	public static double promedio(Vector < ? extends Number> vector) {
		//no funciona sin ? extends xq no aplica el vector integer con el number, en cambio el number admite tanto integers como doubles
		//al añadirlo, ACEPTA TAMBIEN LAS SUBCLASES DE NUMBER.
		double suma = 0.0;
		for(Number v : vector) {
			suma = suma + v.doubleValue();
		}
		suma = suma/vector.size();
		
		return suma;
	}
	
	public static void main(String[] args) {
		
		Vector <Integer> enteros = new Vector<Integer>();
		for(int i = 1; i <= 5; i++) {
			enteros.add(i);
		}
		System.out.println("Vector de enteros " + enteros.toString() + " el promedio es " + promedio(enteros));
		
		
		Vector<Double> reales = new Vector <Double>();
		
		for(int i = 1; i <= 5; i++) {
			reales.add(i * 1.0);
		}
		
		System.out.println("Vector de reales " + reales.toString() + " el promedio es " + promedio(reales));
		
		Vector< Number > numeros = new Vector<Number>();
		
		for(int i = 1; i <= 5; i++) {
			if(i % 2 == 0) {
				numeros.add(i);
			}
			else {
				numeros.add(i* 1.0);
			}
		}
		
		System.out.println("Vector de numeros " + numeros.toString() + " el promedio es " + promedio(numeros));
	}

	

}
