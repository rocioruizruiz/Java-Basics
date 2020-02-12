package EmpresaConsultora;

public class Ingeniero extends Empleado {

	
	public Ingeniero(String nif, String nombre, String apellidos, int anoContratacion, double retribucion) {
		super(nif, nombre, apellidos, anoContratacion, retribucion);
		// TODO Auto-generated constructor stub
	}

	public double getSubidaSalarial() {
		// TODO Auto-generated method stub
		double sueldoActual =  super.getRetribucion();
		if(super.getAntigüedad() >= 5) {
			return (sueldoActual*2/100);
		}
		else {
			return (sueldoActual * 0.015);
		}
	}
}
