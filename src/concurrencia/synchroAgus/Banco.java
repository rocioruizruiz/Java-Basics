package concurrencia.synchroAgus;

//   Retiros y depositos concurrentes sin sincronizacion
//
//   El saldo inicial de la cuenta corriente es 100eu, hay dos procesos de retiro y deposito
//
//   El importe de los retiros es de 10eu y se realizan 5 por un total de 100 considerando ambos procesos, 
//   el importe de los depositos es de 10eu y se realizan 5 por un total de 100.
//
//   Si el saldo inicial era de 100, el final deberia ser el mismo. Los procesos no estan sincronizados y al finalizar 
//   el saldo es 150.

public class Banco {

	public static void main(String[] args) {
		// el saldo inicial de la cuenta es 100 euros
		Cuenta cuenta = new Cuenta(0);
		// dos procesos de depósito que realizan 5 abonos de 10 euros
		// dos procesos de retiro que realizan 5 cargos de 10 euros
		Thread[] procesos = new Thread[4];
		procesos[0] = new Retiro(cuenta, 5, 10.0);
		procesos[1] = new Retiro(cuenta, 5, 10.0);
		procesos[2] = new Deposito(cuenta, 15, 10.0);
		procesos[3] = new Retiro(cuenta, 5, 10.0);

		for(int i = 0; i < procesos.length; i++) {
			procesos[i].start();
		}

		for(int i = 0; i < procesos.length; i++) {
			try {
				procesos[i].join();
			} catch(InterruptedException ie) {
				System.err.println(ie.getMessage());
			} finally {
				System.out.println("finaliza la transacción "+ (i+1));
			}
		}
		System.out.println("el saldo final " + cuenta.getSaldo() + " eur.");
	}
}