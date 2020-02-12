package objetos;

public class Amigo {
	// una clase describe atributos y metodos de un conjunto de objetos.
	private String dni;
	private String nombre;
	private String apellidos;
	private String telefono;
// la clase  
	public Amigo(String dni, String nombre, String apellidos) {
		 // se puede usar el this o como toda la vida
		 this.nombre = nombre;
		 this.dni = dni;
		 this.apellidos = apellidos;
		 //apell = apellidos;
		 this.telefono = "?";
	}
	
	public Amigo(String dni, String nombre, String apell, String telefono) {
		 // se puede usar el this o como toda la vida
		 this.nombre = nombre;
		 this.dni = dni;
		 apell = apellidos;
		 this.telefono = telefono;
	}
	
	
	public String getDni() {
		return this.dni;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	public String getTelefono() {
		return this.telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono=telefono;
	    
	}
	
	
	public static void main(String[] args) {
		 Amigo alvaro = new Amigo("4255542l", "Alvaro", "Sanchiz");
		 
		 System.out.println("");
		 System.out.println("Nombre del object: " + alvaro.getNombre());
		 System.out.println("Apellidos del object: " + alvaro.getApellidos());
		 System.out.println("Telefono : " + alvaro.getTelefono());
		 
		 alvaro.setTelefono("123456789");
		 
		 
		 System.out.println("");
		 System.out.println("Nombre del object: " + alvaro.getNombre());
		 System.out.println("Apellidos del object: " + alvaro.getApellidos());
		 System.out.println("Telefono : " + alvaro.getTelefono());
	}
}
		 