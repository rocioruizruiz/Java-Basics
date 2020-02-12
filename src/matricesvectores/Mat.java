package matricesvectores;
import java.util.*;

public class Mat {
	
	public static int minimo(int [] vector) {
		int minimo = vector[0];
		for(int i = 0; i < vector.length; i++) {
			if(vector[i] < minimo) {
				minimo = vector[i];
			}
		}
		return minimo;
	}

	public static String toString(int [] vector) { String s = "{";
		for (int i=0; i<vector.length; i++) { 
			s = s + vector[i];
			if (i < vector.length-1) {
				s = s + ", ";
			}
		}
		      return s + "}";
	}
	
	public static String toString(int [] vector, String nombre) { 
		return nombre + " " + toString(vector);
	}
	public static String toString(int [][] matriz, String nombre) { 
		String s = nombre + "\n";
		for (int i=0; i<matriz.length; i++) {
			s = s + toString(matriz[i]) + "\n";
		}
		return s; 
	}


	public static boolean busca(int [] vector, int n) {
		
		for(int i = 0; i < vector.length; i++) {
			if(vector[i] == n) {
				return true;
			}
		}
		return false;
	}
	public static int [] producto(int k, int [] vector) {
		int [] v = new int [vector.length];
		for(int i = 0; i < vector.length; i++) {
			v[i] = vector[i]*k;
		}
		return v;		
	}
	
	public static int [][] producto(int k, int [][] a){
		int [][] producto = new int [a.length][a[0].length];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				producto [i][j] = a[i][j] * k;
			}
		}
		return producto;
	}
	public static boolean esIgual(int[] s, int [] v) {
		if(s.length != v.length) return false;
		for(int i = 0; i < s.length; i++) {
			if(s[i] != v[i]) return false;
		}
		return true;
	}
}
