package fundamentos;

public class ConversionTipos {
	/*
	 * Conversion implicita y explicita de tipos (casting)
	 */
	public static void main(String[] args) {
		byte b;
		char c;
		short s;
		int i;
		long l;
		float f;
		
		//Conversion implicita de tipos
		/*
		 * un tipo de dato entero o real se convierte implicitamente a otro tipo entero o real si 
		 * el tipo de destino tiene suficiente capacidad par aalmacenar el tipo de dato origen
		 */
		
		b = 125;
		s = b;
		
		System.out.println("Castin implicito \n");
		System.out.println("byte " + b + "\t short = byte \t short " + s + "\t byte     " + b);
		
		s = 32767;
		i = s;
		
		System.out.println("short " + s + "\t int = short \t int " + i + "\t short    " + s);
		
		l = i;
		
		System.out.println("int " + s + "\t long = short \t long " + i + "\t int      " + s);
		
		f = i;
		
		System.out.println("int " + s + "\t float = long \t float " + i + "\t int      " + s);
		//El compilador no permite asignar un valor short en un byte de forma implicita
		
		//Conversion explicita
		/*
		 * (casting): puede provocar pérdida de datos en tiempo de ejecucion
		 */
		System.out.println("\nCasting explícito\n");
		
		c = 65;
		s = (short) c;
		System.out.println("char " + c + "\t\t short = char \t short " + s + "\t char " + c);
		
		s++;
		c = (char) s;
		System.out.println("short " + s + "\t char = short \t char " + c + "\t\t short " + s);
		
		s = 125;
		b = (byte) s;
		System.out.println("short " + s + "\t byte = short \t byte " + b + "\t short " + s);
		
		s = -134;
		b = (byte) s;
		System.out.println("short " + s + "\t byte = short \t byte " + b + "\t short " + s);
		
	}

}
