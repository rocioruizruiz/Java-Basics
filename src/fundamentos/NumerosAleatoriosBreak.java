package fundamentos;

public class NumerosAleatoriosBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 1;
		int numero;
		
		do {
			numero = (int) (100* Math.random());
			System.out.println("Numero aleatorio " + c++ + "\t" + numero);
			
			if(numero % 25 == 0)
				break;
			
		}while (c <= 100);

	}

}
