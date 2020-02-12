package red;

public class Mensaje {
	private Persona destinatario;
	private String texto;
	
	public Mensaje(Persona destinatario, String texto) {
		this.destinatario = destinatario;
		this.texto = texto;
	}
	
	public Persona getDestinatario() {
		return this.destinatario;
	}
	
	public String getTexto() {
		return this.texto;
	}

}
