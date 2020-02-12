package concurrencia.synchroAgus;

public class Cuenta {

	private double saldo;

	public Cuenta(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public synchronized void deposito(double importe) {
		double nuevoSaldo = this.saldo;
		nuevoSaldo = nuevoSaldo + importe;

		try {
			Thread.sleep(300); // simula el tiempo de la transacción
		} catch (InterruptedException ie) {
			System.err.println(ie.getMessage());
		}

		System.out.println("el saldo después del depósito " + nuevoSaldo);
		this.saldo = nuevoSaldo;
	}

	public synchronized void retiro(double importe){
		if (this.saldo < importe) {
			
			System.out.println("No hay saldo suficiente!");
			return;
		}

		double nuevoSaldo = this.saldo;
		nuevoSaldo = nuevoSaldo - importe;

		try {
			Thread.sleep(200); // simula el tiempo de la transacción
		} catch (InterruptedException ie) {
			System.err.println(ie.getMessage());
		}

		System.out.println("el saldo después del retiro " + nuevoSaldo);
		this.saldo = nuevoSaldo;
	}
}
