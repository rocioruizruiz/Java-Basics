package objetos;

import java.util.Calendar;

public class Persona {


	private String nombre;
	private String apellidos;
	private int dia;
	private int mes;
	private int anio;
	private String telefono;


	public Persona(String nombre, String apellidos, int dia, int mes, int anio, int edad){
		 this.nombre=nombre;
		 this.apellidos=apellidos;
		 this.dia=dia;
		 this.mes=mes;
		 this.anio=anio;
 
}

	public Persona(String indice, String nombre, String apellidos, int dia, int mes, int año, String telefono) {
	// TODO Auto-generated constructor stub
		this.nombre = nombre;
		 this.apellidos = apellidos;
		 this.dia = dia;
		 this.mes = mes;
		 this.anio = anio;
		 this.telefono = telefono;
}
	

	public String getNombre() {
		return this.nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	public int getDia() {
		return this.dia;
	}
	public int getMes() {
		return this.mes;
	}
	public int getAnio() {
		return this.anio;
	}
	// metodos publicos compartidos por todas las instancias de la clase con el (public static int calculaEdad)
	public int getEdad() {
	 
		return calculaEdad(this.dia, this.mes, this.anio);
	 
	}
	
	public static int calculaEdad(int dia, int mes, int anio) {
	 
		 int diaHoy, añoHoy, edad, mesHoy;
		 diaHoy = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		 mesHoy = Calendar.getInstance().get(Calendar.MONTH);
		 añoHoy = Calendar.getInstance().get(Calendar.YEAR);
	 
		 if((mesHoy > mes) || (mesHoy == mes) && (diaHoy >= dia))
			 
			 edad = añoHoy - anio;
		 else
			 edad = añoHoy - anio - 1;
		   	 return edad;
	 
	 
	}
	
	public String getDatos() {
		
		return  this.nombre + " " +
				this.apellidos + " " + "\t" +
				this.getEdad() + " ";
		 
	 
	}
	public static void main(String[] args) {
	 // TODO Auto-generated method stub
	 Persona alvaro = new Persona("Alvaro", "Sanchiz", 22, 02, 2000, 19);
	 Persona julio = new Persona("Julio", "Ruiz", 21, 03, 1999, 20);
	 
	 System.out.println("");
	 System.out.println(alvaro.getDatos());
	 System.out.println(julio.getDatos());
	 
	}

	
	
	}
