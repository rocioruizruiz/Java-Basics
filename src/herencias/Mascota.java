package herencias;

import java.util.Calendar;

public abstract class Mascota { 
	
	private String nombre; 
	private char genero; 
	private String color; 
	private String raza; 
	private int añoNacimiento;
	
	
	public Mascota(String nombre, char genero, String color, String raza, int añoNacimiento) {
		this.nombre = nombre;
		this.genero = genero;
		this.color = color;
		this.raza = raza;
		this.añoNacimiento = añoNacimiento;
	}
	
	public String getEdad() {
		// devuelve la edad del objeto Mascota usando la tabla de edades
		int años = Calendar.getInstance().get(Calendar.YEAR) - this.añoNacimiento;
		String answer = "";
		if(años <= 1) {
			answer = "Cachorro";
			
		}
		else if((años > 1) && (años <= 3)) {
			answer = "Adolescente";
		}
		else if((años > 3) && (años <= 6)) {
			answer = "Joven";
		}
		else if((años > 6) && (años <= 9)) {
			answer = "Adulto";
		}
		else if(años > 9) {
			answer = "Viejo";
		}
		
		return answer;
	}
	public String getDatos() {
		// devuelve todos los datos almacenados del objeto Mascota
		return this.getDatos();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public char getGenero() {
		return genero;
	}


	public void setGenero(char genero) {
		this.genero = genero;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public int getAñoNacimiento() {
		return añoNacimiento;
	}


	public void setAñoNacimiento(int añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}
}