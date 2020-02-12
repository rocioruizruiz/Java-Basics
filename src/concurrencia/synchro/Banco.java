package concurrencia.synchro;

public class Banco {
	   
	/*  
	 *  Retiros y depósitos concurrentes sin sincronización
	 * 
	 *  El saldo inicial de la cuenta corriente es 100 euros, hay dos procesos de retiro y de depósito
	 *  
	 *  El importe de los retiros es de 10 euros y se realizan 5 operaciones cada vez (50 euros), lo que
	 *  hace un total de 100 euros considerando los 2 procesos de retiro. El importe de los depósitos es
	 *  de 10 euros y se realizan 5 operaciones cada vez (50 euros), un total de 100 euros considerando
	 *  ambos procesos de depósito 
	 *  
  	 *  Si el saldo inicial es de 100 euros, el saldo final debería ser 100 eur. Los procesos no están
  	 *  sincronizados y al finalizar las operaciones el saldo de la cuenta es 150 euros
  	 *  
	 */
	
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta(0);

		// un proceso de deposito que realiza 15 abonos de 10 euros
		//tres procesos de retiro qeu realizan 5 cargos de 10 euros

		Thread[] procesos = new Thread[4];

		procesos[0] = new Retiro(cuenta, 5, 10.0); //error de sincro x hacerlo fraccionado el deposito
		procesos[1] = new Retiro(cuenta, 5, 10.0);   //error de sincro x hacerlo fraccionado el retiro
		procesos[2] = new Deposito(cuenta, 15, 10.0); //
		procesos[3] = new Retiro(cuenta, 5, 10.0);   //

		
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
	      
		System.out.println("el saldo final es " + cuenta.getSaldo() + " euros");
	    
	}
	
}
