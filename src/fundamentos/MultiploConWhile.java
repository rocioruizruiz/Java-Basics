package fundamentos;

public class MultiploConWhile {
	/*
	 * Es multiplo determina si n es multiplo de m utilizando restas sucesivas
	 */
	public static boolean esMultiplo(int n, int m) {
		while(n >= m) {
			n = n - m;
		}
		return (n == 0);
	}
	public static void multiplo(int n, int m) {
		if(esMultiplo(n,m))
			System.out.println(n + " es multiplo de " + m);
		else
			System.out.println(n + " no es multiplo de " + m);
		
	}
	
	public static void main(String[] args) {
		multiplo(3,3);
		multiplo(9,2);
		multiplo(6,2);
		multiplo(8,3);
		multiplo(9,3);
		multiplo(15,3);
	}


}
