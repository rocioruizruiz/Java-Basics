package EmpresaConsultora;

import java.util.Calendar;

public abstract class Empleado {
	private String nif;
	private String nombre; 
	private String apellidos; 
	private int anoContratacion; 
	private double retribucion;
	public Empleado(String nif, String nombre, String apellidos, int anoContratacion, double retribucion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anoContratacion = anoContratacion;
		this.retribucion = retribucion;	
	}
	public String getNIF() {
		return nif;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() { 
		return apellidos;
	}
	public int getAñoContratacion() {
		return anoContratacion;
	}
	public int getAntigüedad() {
		return Calendar.YEAR - anoContratacion;
	}
	public double getRetribucion() {
		return retribucion;
	}
	abstract public double getSubidaSalarial();
	public String getDatos() {
		return "";
	}
}
