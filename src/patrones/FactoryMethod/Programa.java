package patrones.FactoryMethod;

public class Programa {
	
	public static void main(String[] args) {
		
		Reloj r1 = RelojFactory.creaReloj(RelojFactory.RELOJ_12H); 
		Reloj r2 = RelojFactory.creaReloj(RelojFactory.RELOJ_24H);

		System.out.println(r1.getHora());
		System.out.println(r2.getHora());
	}
}