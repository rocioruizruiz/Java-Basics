package patrones.Strategy;

public class CondicionesTiempo {

	private int temperatura;
	private int humedad;
	private Strategy estrategia;

	public CondicionesTiempo(int temperatura, int humedad, Strategy estrategia) {
		this.temperatura = temperatura; this.humedad = humedad; this.estrategia = estrategia;
	}
	public void setEstrategia(Strategy estrategia) { 
		this.estrategia = estrategia;
	}
	public int getTemperatura() { 
		return this.temperatura;
	}
	public int getHumedad() { 
		return this.humedad;
	}
	public boolean getRecomendacion() {
		return this.estrategia.recomendacion(this.temperatura, this.humedad);
	} 
}