package genericos;

import java.util.Vector;


public class Pila<T> {
	private Vector<T> pila;
	
	public Pila() {
		this.pila = new Vector<T>();
	}
	public void apila(T e) {
		pila.add(e);
	}
	public T despila() {
		T i = pila.elementAt(pila.size() - 1);
		pila.remove(pila.size() - 1);
		return i;
	}
	public T tope() {
		// te devuelve el ultimo
		//return pila.elementAt(pila.size() - 1);
		return this.pila.lastElement();
		
	}
	public boolean vacia() {
		//te dice si esta vacia
		return (pila.size() == 0);
		
	}
}
	
	