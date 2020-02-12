package swing;

import javax.swing.JOptionPane;


public class Mascota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] mascotas = {"perro", "gato", "pato"};
		
		int mascota = JOptionPane.showOptionDialog(null, "¿Qué mascota tienes?", "swing",  JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, mascotas, mascotas[0] );
		
		Object[] colores = {"blanco", "negro", "pardo"};
		int color = JOptionPane.showOptionDialog(null, "De que color es? ", "swing", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, colores, colores[0]);
		
		JOptionPane.showMessageDialog(null, "Tienes un " + mascotas[mascota] + " de color " + colores[color]);
		}

}
