package patrones.Observer;

public interface Subject {
	/*
	 * El patron observer define una dependencia del tipo uno a muchos entre distintos objetos.
	 * Cuando un objeto cambia de estado, se notifca el cambio a los objetos que dependen de él.
	 */
	
	public void añadirObservador(Observer o);
	//SERIA COMO EMPEZAR A SEGUIR A ALGUIEN EN UNA RED, PA QUE TE NOTIFIQUEN DE SUS MOVIMIENTOS Y TAL
	
	public void eliminarObservador(Observer o);
	//SERIA COMO DEJAR DE SEGUIR A ALGUIEN EN UNA RED, PA QUE TE DEJEN DE NOTIFICAR DE SUS MOVEMENTS
	
	public void notificarObservadores(String mensaje);
}