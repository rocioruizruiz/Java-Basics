package patrones.Strategy;

public class SenderismoStrategy implements Strategy {
	@Override
	public boolean recomendacion(int temperatura, int humedad) {
		return (temperatura >=10 && temperatura <=30) && (humedad >= 10 && humedad <= 60);
	} 
}