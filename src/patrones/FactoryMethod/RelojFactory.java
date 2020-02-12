package patrones.FactoryMethod;

public class RelojFactory {
	public static final int RELOJ_12H = 0; 
	public static final int RELOJ_24H = 1;
	public static Reloj creaReloj(int tipo){ 
		if (tipo == RelojFactory.RELOJ_12H)
			return new Reloj12H();
		else
			return new Reloj24H();
	} 
}