package fundamentos;

public class Excepciones {
	/*
	 * Uso de excepciones para gestionar los errores en tiempo de ejecucion
	 */

	public static void main(String[] args) {
		
		//cálculo de la sumatoria desde 1 hasta 150 (11.325) con un for
		int suma = 0;
		
		for(int i=1; i <=150; i++)
			suma = suma + i;
		System.out.println("La sumatoria desde 1 hasta 150 es: " + suma);
		
		//Si la variable i del for se declara byte, se produce un bucle infinito 
		//y es necesario interrupir la ejecucion con el boton terminate de la consola
		
		int [] v = new int[150]; // Asi se declara el array (150 es el tamaño del vector)
		
		for(int i=1; i < 150; i++) 
			v[i] = 1;
		
		suma = 0;
		
		for(int i=1; i < 150; i++)
			suma = suma + v[i];
		
		System.out.println("La sumatoria desde de los elementos del vector es: " + suma);
		
		//Si la variable i del for se declara byte, se produce la excepccion ArrayIndexOutOfBounds
		

		suma = 0;
		// Es necesario usar el break en el catch para interrumpir el for
		for(byte i=1; i < 150; i++)
			try {
				suma = suma + v[i];
			}catch(Exception e) {
				System.out.println("La posicion " + i + " no exite en el vector! "); break;
			}
		
		
		

	}

}
