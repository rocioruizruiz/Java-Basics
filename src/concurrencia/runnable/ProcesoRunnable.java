package concurrencia.runnable;

public class ProcesoRunnable implements Runnable { 
	private static int total;
	private String texto;
	private int espera;
	public ProcesoRunnable(String texto, int espera) { 
		this.texto = texto;
		this.espera = espera;
		this.total = this.espera * 30;
	}
	public void run() {
		try {
			while (true) { 
				
				System.out.print(this.texto);
				
				Thread.sleep(espera);
				
				total = total - this.espera;
				
				if (this.total <= 0) 
					return;
			}
		} catch (InterruptedException e) {
			return; 
		}
	}
	public static void main(String[] args) {
		
		Runnable p1 = new ProcesoRunnable("0", 10); 
		Runnable p2 = new ProcesoRunnable("1", 30);
		
		new Thread(p1).start(); 
		new Thread(p2).start();
	}
}
