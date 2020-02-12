package concurrencia.threads;
/*
 * Java ofrece programación concurrente y permite al programador especificar los procesos que se ejecutan simultáneamente. 
 * La programación concurrente permite aprovechar mejor los recursos de los procesadores con varios núcleos. 
 * En general, la programación concurrente reduce el tiempo de ejecución de los programas e incrementa su eficiencia.
 */

/*
 * El método run() define el código que ejecuta un thread. 
 * La ejecución de un thread se inicia con el método start(). 
 * Un thread termina cuando el método run() llega a su fin o ejecuta una sentencia return.
 */

public class ProcesoThread extends Thread {
	private static int total;
	private String texto;
	private int espera;

	public ProcesoThread(String texto, int espera) { 
		this.texto = texto;
		this.espera = espera;
		total = this.espera * 30;
	}
	public void run() {
		try {
			while (true) { 
				System.out.print(this.texto); 
				Thread.sleep(this.espera); 
				total = total - this.espera;
				if (total <= 0) return;
			}
		} catch (InterruptedException e) {
			return; 
		}
	}
	public static void main(String[] args) throws InterruptedException { 
		ProcesoThread p1 = new ProcesoThread("0", 10); //delay de 10
		ProcesoThread p2 = new ProcesoThread("1", 30); //delay de 30


		p1.start(); 
		Thread.sleep(200); 
		p2.start();
	} 
}