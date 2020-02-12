package patrones.Proxy;

public class LlamadaTelefonicaProxy implements LlamadaTelefonica { 
	
	private Telefono telefono = new Telefono();
	
	@Override
	public void llamar(String numero) {
		
		System.out.println("Llamando con el Proxy");
		telefono.llamar(numero); 
		
	}
}