package protectora.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ProgramaReadObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreFichero = "/Users/rocioruizruiz/Documentos/Segundo/AmpliacionProgramacion/Files/adoptame.txt";
		
		try {
			
			ObjectInputStream objetoEntrada = new ObjectInputStream(new FileInputStream(nombreFichero));
			Protectora adoptame = (Protectora) objetoEntrada.readObject();

			adoptame.imprimirMascotas();  
			adoptame.imprimirMascotas("Perro","Cachorro"); 
			adoptame.imprimirMascotas("Perro", "Adolescente");
			adoptame.imprimirMascotas("Perro", "Adulto");
			adoptame.imprimirMascotas("Perro", "Viejo");
			adoptame.imprimirMascotas("Gato", "Adolescente"); 
			adoptame.imprimirMascotas("Gato", "Joven"); 
			adoptame.imprimirMascotas("Gato", "Adulto");
			
			objetoEntrada.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("El fichero" + nombreFichero + " no existe");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		};

	}

}
