package protectora.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ProgramaWriteObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Protectora adoptame = new Protectora("www.adoptame.com"); 
		
		System.out.println(adoptame.getClass() + "\n\n");
		
		adoptame.registrarMascota(new Perro("Golfo", 'M', "Negro", "Común", 2018, "Mediano")); 
		adoptame.registrarMascota(new Perro("Luna", 'H', "Negro", "Cocker", 2019, "Mediano")); 
		adoptame.registrarMascota(new Perro("Roco", 'M', "Canela", "Boxer", 2015, "Mediano")); 
		adoptame.registrarMascota(new Perro("Igor", 'M', "Canela", "Pastor", 2012, "Mediano")); 
		adoptame.registrarMascota(new Perro("Boris", 'M', "Paja", "Golden", 2016, "Grande")); 
		adoptame.registrarMascota(new Perro("Nevada", 'H', "Blanco", "Caniche", 2012, "Pequeño")); 
		adoptame.registrarMascota(new Gato("Bala", 'M', "Gris", "Común", 2012, "Mimoso")); 
		adoptame.registrarMascota(new Gato("Chiara", 'H', "Blanco", "Común", 2017, "Cariñosa")); 
		adoptame.registrarMascota(new Gato("Lucas", 'M', "Pardo", "Común", 2014, "Cariñoso")); 
		adoptame.registrarMascota(new Gato("Virgola", 'H', "Gris", "Común", 2010, "Cariñoso"));
		
		//Las consultas
		
		adoptame.imprimirMascotas();  
		adoptame.imprimirMascotas("Perro","Cachorro"); 
		adoptame.imprimirMascotas("Perro", "Adolescente");
		adoptame.imprimirMascotas("Perro", "Adulto");
		adoptame.imprimirMascotas("Perro", "Viejo");
		adoptame.imprimirMascotas("Gato", "Adolescente"); 
		adoptame.imprimirMascotas("Gato", "Joven"); 
		adoptame.imprimirMascotas("Gato", "Adulto");


		String nombreFichero = "/Users/rocioruizruiz/Documentos/Segundo/AmpliacionProgramacion/Files/adoptame.txt";
				
		try {
			ObjectOutputStream objetoSalida = new ObjectOutputStream(new FileOutputStream(nombreFichero));
			
			objetoSalida.writeObject(adoptame);
			objetoSalida.close();
		}catch(FileNotFoundException e) {
			System.out.println("El fichero" + nombreFichero + " no existe");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		};
	}

}


