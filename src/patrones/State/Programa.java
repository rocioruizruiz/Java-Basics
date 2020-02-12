package patrones.State;

public class Programa {
	public static void main(String[] args) {
		
		Pedido p1 = new Pedido("Pedido 1"); 
		Pedido p2 = new Pedido("Pedido 2");
		
		System.out.println(p1.getEstado()); 
		p1.estadoSiguiente(); 
		
		System.out.println(p1.getEstado());
		p1.estadoSiguiente(); 
		
		System.out.println(p1.getEstado());
		p1.estadoSiguiente();
		
		System.out.println(p1.getEstado());
		p2.estadoSiguiente();
		
		System.out.println(p2.getEstado());
	}
}