package patrones.Builder;

public class Usuario {
	private String email;
	private String nombre;
	private int añoNacimiento;
	private boolean activo;
	
	// constructor
	
	public String getEmail() { 
		return this.email;
	}
	public String getNombre() { 
		return this.nombre;
	}
	public int getAñoNacimiento() { 
		return this.añoNacimiento;
	}
	public boolean getActivo() { 
		return this.activo;
	}
	public String getDatos() {
		return this.email + "\t" + this.nombre + "\t" +

	((this.añoNacimiento != 0) ? this.añoNacimiento : "????") + "\t" + ((this.activo) ? "activo" : "inactivo");

	}
	
	private Usuario(UsuarioBuilder usuario) { 
		this.email = usuario.getEmail();
		this.nombre = usuario.getNombre(); 
		this.añoNacimiento = usuario.getAñoNacimiento(); 
		this.activo = usuario.isActivo();
	}
	public static class UsuarioBuilder {

		private String nombre;
		private int añoNacimiento;
		private boolean activo;
		private String email;
		
		// constructor para los atributos obligatorios: nombre del usuario, email
		
		public UsuarioBuilder(String nombre, String email) { 
			this.nombre = nombre;
			this.email = email;
		}
		// métodos set para los atributos opcionales del constructor:
		// añoNacimiento, activo
		public UsuarioBuilder setAñoNacimiento(int añoNacimiento) { 
			this.añoNacimiento = añoNacimiento;
			return this;
		}
		public UsuarioBuilder setActivo(boolean activo) { 
			this.activo = activo;
			return this;
		}
		// método build con validación para garantizar que la instancia
		// almacena datos correctos
		public Usuario build() {
			Usuario usuario = new Usuario(this);
			
			if (usuario.getAñoNacimiento() > 2000) {
				throw new IllegalArgumentException("El usuario '" + usuario.getNombre() + "' debe ser mayor de edad");
			}
			return new Usuario(this);
		}
		
		public String getEmail() {
			return email;
		}
		public String getNombre() {
			return nombre;
		}
		public int getAñoNacimiento() {
			return añoNacimiento;
		}
		public boolean isActivo() {
			return activo;
		}
	}
}