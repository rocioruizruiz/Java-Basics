package concurrencia.unsynchro;

public class Deposito extends Thread {
	private Cuenta cuenta;
	private int transacciones;
	private double importe;

	public Deposito(Cuenta cuenta, int transacciones, double importe) { 
		this.cuenta = cuenta;
		this.transacciones = transacciones;
		this.importe = importe;
	}

	public void run() {
		// en vez de hacer un DEPOSITO por el importe total, hacemos el for para dividirlo en varias transacciones y provocAR ASI EL ERROR
		// COMO EN RETIRO
		for(int i = 1; i <= this.transacciones; i++) {
			this.cuenta.deposito(this.importe); // sin sincronización }
		} 
	}
}