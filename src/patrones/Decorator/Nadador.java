package patrones.Decorator;

public class Nadador extends MascotaDecorator{
	
	public Nadador(Mascota mascota) {
		super(mascota);
	}

	@Override
	public String masCaracteristicas() {
		return ", me gusta nadar";
	}

}
