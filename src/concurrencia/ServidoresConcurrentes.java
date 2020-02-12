package concurrencia;

import java.util.concurrent.TimeUnit; 
public class ServidoresConcurrentes {
	public static void main(String[] args) throws InterruptedException {
		Lote l1 = new Lote(1, new int[] { 3, 2, 2, 4, 1, 3 }); 
		Lote l2 = new Lote(2, new int[] { 2, 4, 5, 3, 2 }); 
		Lote l3 = new Lote(3, new int[] { 1, 2, 5, 4, 2, 1 });
		
		Servidor s1 = new Servidor(1, l1, System.currentTimeMillis()); 
		Servidor s2 = new Servidor(2, l2, System.currentTimeMillis()); 
		Servidor s3 = new Servidor(3, l3, System.currentTimeMillis());
		
		TimeUnit.SECONDS.sleep(1); s1.start(); 
		TimeUnit.SECONDS.sleep(2); s2.start();
		TimeUnit.SECONDS.sleep(1); s3.start();
	} }