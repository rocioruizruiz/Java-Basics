package herencias;
import java.util.Vector;
public class Protectora {
	private String web;
	private Vector<Mascota> mascotas;
	
	public Protectora(String web) {
	this.web = web;
	this.mascotas = new Vector<Mascota>();
	}
	
	public String getWeb() {
	// devuelve la web del objeto Protectora
		return this.web;
	}
	
	public void registrarMascota(Mascota m) {
	// registra una nueva mascota en el objeto Protectora
		mascotas.add(m);
	}
	
	public void imprimirMascotas() {
	// muestra en la consola todas las mascotas registradas
		for(Mascota m: mascotas) {
			System.out.println(m.getDatos());
		}
	}
	
	public void imprimirMascotas(String clase, String edad) {
	// muestra en la consola las mascotas de la clase y la edad indicada
		for(Mascota m: mascotas) {
			if(m.getClass().equals(clase) && m.getEdad().equals(edad)) {
				System.out.println(m.getDatos());
			}
		}
	} 
	
}
