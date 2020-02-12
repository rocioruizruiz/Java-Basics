package fundamentos;

public class TieneTodasLasVocalesCharAt {
	public static void main(String[] args) {
	String palabra = "euforia";
	int[] vocales = new int [5];
	palabra = palabra.toLowerCase();
	char [] letras = palabra.toCharArray();
	
 	for(int i = 0; i < palabra.length(); i++) {                        //deberia ir sin parentesis---------------------------------
		if(letras[i] == 'a' || letras[i] == 'á') vocales[0]++;
		else if(letras[i] == 'e' || letras[i] == 'é') vocales[1]++;
		else if(letras[i] == 'i' || letras[i] == 'í') vocales[2]++;
		else if(letras[i] == 'o' || letras[i] == 'ó') vocales[3]++;
		else if(letras[i] == 'u' || letras[i] == 'ú') vocales[4]++;
	}
	if(vocales[0] != 0 && vocales[1] != 0 && vocales[2] != 0 && vocales[3] != 0 && vocales[4] != 0)
		System.out.println("Todas las vocales");
	else System.out.println("Faltan vocales");
	}

}
