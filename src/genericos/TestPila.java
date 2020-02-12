package genericos;

import java.util.Stack;

public class TestPila {

	public static void main(String[] args) {
		
		Pila<Integer> numeros = new Pila<Integer>();
		Pila<String> letras = new Pila<String>();
		Stack<Character> vocales = new Stack<Character>();
		
		numeros.apila(10);
		numeros.apila(20);
		numeros.apila(30);
		
		while(!numeros.vacia()) {
			System.out.println("Desapila numero " + numeros.despila());
		}
		
		letras.apila("U");
		letras.apila("O");
		letras.apila("I");
		letras.apila("E");
		letras.apila("A");
		letras.despila();
		
		while(!letras.vacia()) {
			System.out.println("Desapila letra " + letras.despila());
		}
		
		
		/*
		Pila holi = new Pila<Integer>();
		
		holi.apila(3);
		holi.apila(4);
		holi.apila(5);
		holi.apila(6);
		System.out.println(holi.tope());
		System.out.println(holi.despila());
		System.out.println(holi.tope());
		System.out.println(holi.despila());
		System.out.println(holi.despila());
		System.out.println(holi.despila());
		System.out.println(holi.vacia());
		
		
		Pila hola = new Pila<Double>();
		hola.apila(3.3);
		hola.apila(4.5);
		hola.apila(5.1);
		hola.apila(6.0);
		System.out.println(hola.tope());
		System.out.println(hola.despila());
		System.out.println(hola.tope());
		System.out.println(hola.despila());
		System.out.println(hola.despila());
		System.out.println(hola.despila());
		System.out.println(hola.vacia());
		*/
	}
}


