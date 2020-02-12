package patrones.Composite;

public class Objeto extends Componente{
	private String id;
	
	public Objeto(String id){ 
		this.id = id;
	}

	@Override
	public void desplaza(int dx, int dy) {
		System.out.println("Objeto " + id + " desplazado (" + dx + ", " + dy + ")");
	} 
}