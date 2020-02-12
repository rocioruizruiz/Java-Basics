package swing;
import javax.swing.JOptionPane;
import java.util.*;

public class ComoTeLlamas {
	//no son void es pa q no me de error
	
	public static void CalcularEdad(int diaNacimiento, int mesNacimiento, int añoNacimiento) {
		
	}
	public static void calcularSignoZodiaco(int diaNacimiento, int mesNacimiento) {
		
	}

	public static void main(String[] args) {

		char sexo;
		boolean a = true;
		int diaNacimiento, mesNacimiento, añoNacimiento, edad;
		
		String nombre, zodiaco, mensaje, entrada = "";
		
		Object[] genero = {"chico", "chica"};
		
		do {
			nombre = JOptionPane.showInputDialog("Como te llamas?");
			diaNacimiento =  Integer.parseInt(entrada);
			
		}while(a);

	}

}
