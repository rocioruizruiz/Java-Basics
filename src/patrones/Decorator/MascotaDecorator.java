package patrones.Decorator;

public abstract class MascotaDecorator extends Mascota{
	Mascota mascota;
	
	public MascotaDecorator(Mascota mascota) {
		this.mascota = mascota;
	}
	
	@Override
	public String getCaracteristicas() {
		return this.mascota.getCaracteristicas() + this.masCaracteristicas();
	}
	
	public abstract String masCaracteristicas();
}
