package concurrencia.unsynchro;

public class Buy extends Thread { 
	
	private Cuenta cuenta;
	private int transacciones; 
	private double importe;
	public Buy(Cuenta cuenta, int transacciones, double importe) { 
		this.cuenta = cuenta;
		this.transacciones = transacciones;
		this.importe = importe;
	}
	public void run() {
		// en vez de hacer un retiro por el importe total, hacemos el for para dividirlo en varias transacciones y provocAR ASI EL ERROR 
		for(int i = 1; i <= this.transacciones; i++) {
			this.cuenta.retiro(this.importe); // sin sincronización }
		} 
	}
}