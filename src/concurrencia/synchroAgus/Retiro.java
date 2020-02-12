package concurrencia.synchroAgus;

public class Retiro extends Thread {
	
	private Cuenta cuenta;
	private int transacciones;
	private double importe;
	
	public Retiro(Cuenta cuenta, int transacciones, double importe) {
		this.cuenta = cuenta;
		this.transacciones = transacciones;
		this.importe = importe;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= this.transacciones; i++) {
			synchronized (this.cuenta) {
				while(this.cuenta.getSaldo() < 10) {
					try {
						this.cuenta.wait();
					} catch (InterruptedException ie) {
						System.err.println(ie.getMessage());
					}
				}
				this.cuenta.retiro(this.importe);
			}
		}
	}
}
