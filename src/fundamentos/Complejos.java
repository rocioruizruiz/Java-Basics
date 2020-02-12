package fundamentos;
import nebrija.complejos.*;

public class Complejos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumeroComplejo a, b, i;
		a = new NumeroComplejo( 1,-2); 
		b = new NumeroComplejo( 4, 3 ); 
		i = new NumeroComplejo( 0, 1 );
		System.out.println(NumeroComplejo.toString("a", a)); 
		System.out.println(NumeroComplejo.toString("b", b)); 
		System.out.println(NumeroComplejo.toString("i", i));
		System.out.println(NumeroComplejo.toString("suma(a,b) ", NumeroComplejo.suma(a, b)));
		System.out.println(NumeroComplejo.toString("resta(a,b) ", NumeroComplejo.resta(a, b)));
		System.out.println(NumeroComplejo.toString("producto(i,i) ", NumeroComplejo.producto(i, i)));
	} 

}
