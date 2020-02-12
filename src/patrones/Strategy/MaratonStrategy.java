package patrones.Strategy;

public class MaratonStrategy implements Strategy {
	@Override
	public boolean recomendacion(int temperatura, int humedad) {
		return (temperatura >=5 && temperatura <=25) && (humedad >= 20 && humedad <= 50);
	} 
}