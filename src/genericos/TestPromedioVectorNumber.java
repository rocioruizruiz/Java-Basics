package genericos;

import java.util.Vector;

public class TestPromedioVectorNumber {
	/*
	 * La clase number es una clase abstracta es la superclase de las subclases BigDecimal, BigInteger, Byte,
	 * Double, Float, Integer, Long y Short
	 */
	
	public static double promedio(Vector <Number> vector) {
		double suma = 0.0;
		for(Number v : vector) {
			suma = suma + v.doubleValue();
		}
		suma = suma/vector.size();
		
		return suma;
	}
	
	public static void main(String[] args) {
		// vector de numero enteros
		
		Vector< Number > enteros = new Vector<Number>();
		
		for(int i = 1; i <= 5; i++) {
			enteros.add(i);
		}
		
		System.out.println("Vector de enteros " + enteros.toString() + " el promedio es " + promedio(enteros));
		
		// vector de numero reales
		Vector<Number> reales = new Vector <Number>();
		
		for(int i = 1; i <= 5; i++) {
			reales.add(i * 1.0);
		}
		
		System.out.println("Vector de reales " + reales.toString() + " el promedio es " + promedio(reales));
		
	}

}
