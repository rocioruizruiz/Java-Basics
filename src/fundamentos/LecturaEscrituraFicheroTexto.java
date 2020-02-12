package fundamentos;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LecturaEscrituraFicheroTexto {

	public static void main(String[] args) throws IOException {
		
		int[][] numeros = { { 1, 2, 3, 4, 5},
				 { 6, 7, 8, 9, 10},
				 {11, 12, 13, 14, 15},
				 {16, 17, 18, 19, 20},
				 {21, 22, 23, 24, 25}};
		
		                    //ESCRITURA DE FICHERO
		
		//crea el fichero 
		String idFichero= "D:\\ numeros.txt";
		
		//PrintWriter sirve para escribir en el fichero de texto
		PrintWriter ficheroSalida = new PrintWriter(idFichero);
		
		//for anidado escribe en ficheroSalida los elementos 
		//del array separades por el caracter
		
		for(int i = 0 ; i< numeros.length ; i++) {
			for(int j =0 ; j<numeros.length ; j++) {
				ficheroSalida.print(numeros[i][j] + ",");
			}
			ficheroSalida.println("");
		}
		ficheroSalida.close();
		
		System.out.println("----------------------");
                             //LECTURA FICHERO TXT
		
		File ficheroEntrada= new File(idFichero);
		
		if(ficheroEntrada.exists()) {
			Scanner datosFichero = new Scanner(ficheroEntrada);
			System.out.println("Numeros del Fichero \n");
			while(datosFichero.hasNext()) {
				//mete los datos en el array de String 
				String [] numerosFichero= datosFichero.next().split(","); // separa los caracteres del fichero por la coma 
				for(int i=0;i <numeros.length ; i++) {
					System.out.println(numerosFichero[i]+"");
				}
				System.out.println("");
			}
			datosFichero.close();
		}else {
			System.out.print("�El fichero ' " + idFichero+ " no existe!");
		}
	}
}
