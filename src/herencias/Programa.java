package herencias;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Protectora adoptame = new Protectora("www.adoptame.com"); 
		System.out.println(adoptame.getClass());
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
		
		adoptame.imprimirMascotas();  
		adoptame.imprimirMascotas("Perro","Cachorro"); 
		adoptame.imprimirMascotas("Perro", "Adolescente");
		adoptame.imprimirMascotas("Perro", "Adulto");
		adoptame.imprimirMascotas("Perro", "Viejo");
		adoptame.imprimirMascotas("Gato", "Adolescente"); 
		adoptame.imprimirMascotas("Gato", "Joven"); 
		adoptame.imprimirMascotas("Gato", "Adulto");


	}

}
