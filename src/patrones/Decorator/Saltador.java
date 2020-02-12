package patrones.Decorator;

public class Saltador extends MascotaDecorator {
	
	public Saltador(Mascota mascota) {
		super(mascota);
	}

	@Override
	public String masCaracteristicas() {
		return ", me gusta saltar";
	}

}
