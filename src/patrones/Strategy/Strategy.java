package patrones.Strategy;

public interface Strategy {
	/*
	 * El patrón Strategy permite definir comportamientos específicos para distintas estrategias.
	 * 
	 * La estrategia se decide considerando las condiciones de temperatura y humedad.
	 */

	boolean recomendacion(int temperatura, int humedad);

}