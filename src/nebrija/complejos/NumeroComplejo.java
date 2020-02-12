package nebrija.complejos;


public class NumeroComplejo { 
	private float real; 
	private float imaginario;

	public NumeroComplejo() {
	// método constructor que inicializa a cero el número complejo
		this.real = 0.0f;
		this.imaginario = 0.0f;
	}
	public NumeroComplejo(float real, float imaginario) {
		// método constructor que inicializa el número complejo
		this.real = real;
		this.imaginario = imaginario;
	}
	public NumeroComplejo suma(NumeroComplejo c) { 
		// suma de dos números complejos
		return new NumeroComplejo(this.real + c.real, this.imaginario + c.imaginario);
	}
	public NumeroComplejo resta(NumeroComplejo c) { 
		// resta de dos números complejos
		return new NumeroComplejo(this.real - c.real, this.imaginario - c.imaginario);
	}
	public NumeroComplejo producto(NumeroComplejo c) { 
		// producto de dos números complejos
		return new NumeroComplejo(this.real*c.real - this.imaginario*c.imaginario, this.real*c.imaginario+this.imaginario*c.real);
	}
	public NumeroComplejo conjugado() { 
		// conjugado de un número complejo
		return new NumeroComplejo(real, -imaginario);
	}
	/*public NumeroComplejo reciproco() { 
		// recíproco de un número complejo
	}
	public NumeroComplejo cociente(NumeroComplejo c) { 
		// cociente de dos números complejos
	}
	*/
	public static NumeroComplejo suma(NumeroComplejo a, NumeroComplejo b){ 
		// método estático que calcula la suma de los números complejos a y b
		return new NumeroComplejo(a.real + b.real, a.imaginario + b.imaginario);
	}
	public static NumeroComplejo resta(NumeroComplejo a, NumeroComplejo b) { 
		// método estático que calcula la resta de los números complejos a y b
		return new NumeroComplejo(a.real - b.real, a.imaginario - b.imaginario);
	}
	public static NumeroComplejo producto(NumeroComplejo a, NumeroComplejo c) { 
		// método estático que calcula el producto de los números complejos a y new Runnable() {
		return new NumeroComplejo(a.real*c.real - a.imaginario*c.imaginario, a.real*c.imaginario+a.imaginario*c.real);
	}
	
	public static NumeroComplejo conjugado(NumeroComplejo c) { 
		// método estático que calcula el conjugado de a
		return new NumeroComplejo(c.real, -c.imaginario);
	}
	/*
	public static NumeroComplejo reciproco(NumeroComplejo a) { 
		// método estático que calcula el recíproco de a
	}
	public static NumeroComplejo cociente(NumeroComplejo a, NumeroComplejo b) { 
		// método estático que calcula el cociente de los números complejos a y b
	}
	*/
	public static String toString(String s, NumeroComplejo c) {
		return c.toString(s);
	}
	public String toString(String s) { 
		String num = s + " = (" + this.real;
		if (this.imaginario >= 0) num = num + " + ";
		else num = num+"-";
		
		if (Math.abs(this.imaginario) != 1.0f) num = num + Math.abs(this.imaginario);
		
		num = num + "i)";
		return num; 
	}
}