package concurrencia;

public class Servidor extends Thread {
	private int id;
	private Lote lote;
	private long inicio;

	public Servidor(int id, Lote lote, long inicio) { 
		this.id = id;
		this.lote = lote;
		this.inicio = inicio;
	}
	public long segundos(long inicio) {
		return (System.currentTimeMillis() - inicio) / 1000;
	}
	public void run() {
		System.out.println("el servidor " + this.id +
				" comienza a despachar el lote " + lote.getId() + "\t" + segundos(this.inicio) + " seg.");
		for (int i = 0; i < this.lote.getTareas(); i++) { this.esperar(lote.getTarea(i));
		System.out.println(" el servidor " + this.id + " ejecuta la tarea " + (i + 1) + "\t\t" + segundos(this.inicio) + " seg.");
		}
		System.out.println("el servidor " + this.id + " finaliza el lote " + lote.getId() + "\t\t" + segundos(this.inicio) + " seg.");
	}
	private void esperar(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt(); 
		}
	} 
}