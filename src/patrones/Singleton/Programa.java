
package patrones.Singleton;

public class Programa {

	public static void main(String[] args) {
		// La instancia no se crea con new porque el constructor es privado;
		//
		
		CestaCompraSingleton cesta1, cesta2, cesta3;
		
		cesta1 = CestaCompraSingleton.getInstancia();
		
		cesta1.addProduct("1");
		cesta1.addProduct("2");
		cesta1.addProduct("3");
		
		System.out.println(cesta1.getProductos());
		System.out.println("----------------------");
		
		
		cesta2 = CestaCompraSingleton.getInstancia();
		
		cesta2.addProduct("4");
		cesta2.addProduct("5");
		cesta2.addProduct("6");
		
		System.out.println(cesta2.getProductos());
		System.out.println("----------------------");
		System.out.println(cesta1.getProductos());
		System.out.println("----------------------");
		
		
		cesta3 = CestaCompraSingleton.getInstancia();
		
		cesta3.addProduct("1");
		cesta3.addProduct("2");
		cesta3.addProduct("3");
		
		System.out.println(cesta3.getProductos());
		System.out.println("----------------------");
		
		

	}

}
