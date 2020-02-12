package patrones.Singleton;
import java.util.*;
import java.util.Vector;

/*
 * El patron Singletone asegura que existe una sola instancia de una clase y proporciona un punto de acceso a este objeto
 */

public class CestaCompraSingleton {
	private Vector<String> productos;
	private static CestaCompraSingleton instancia = null;
	
	//El constructor se declara private
	private CestaCompraSingleton() {
		this.productos = new Vector<String>();
	};
	
	//el metodo getInstancia solo crea la instancia si es null.
	public static synchronized CestaCompraSingleton getInstancia() {
		if (instancia == null) {
			instancia = new CestaCompraSingleton();
		}
		return instancia;
	}
	
	public void addProduct(String producto) {
		this.productos.add(producto);
	}
	
	public String getProductos() {
		String productos = "";
		
		for(String p: this.productos) {
			productos = productos + p + "\n";
		}	
		return productos;
	}
}
