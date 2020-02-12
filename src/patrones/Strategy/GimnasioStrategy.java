package patrones.Strategy;

public class GimnasioStrategy implements Strategy {
	@Override
	public boolean recomendacion(int temperatura, int humedad) {
		return true;
	}
}