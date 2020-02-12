package fundamentos;

public class TieneTodasLasVocales {
	public static void main(String[] args) {
	String palabra = "euforia";
	palabra = palabra.toLowerCase();
	int[] vocales = new int [5];
	for(int i = 0; i < palabra.length(); i++) {
		if(palabra.charAt(i) == 'a' || palabra.charAt(i) == 'á') vocales[0]++;
		else if(palabra.charAt(i) == 'e' || palabra.charAt(i) == 'é') vocales[1]++;
		else if(palabra.charAt(i) == 'i' || palabra.charAt(i) == 'í') vocales[2]++;
		else if(palabra.charAt(i) == 'o' || palabra.charAt(i) == 'ó') vocales[3]++;
		else if(palabra.charAt(i) == 'u' || palabra.charAt(i) == 'ú') vocales[4]++;
	}
	if(vocales[0] != 0 && vocales[1] != 0 && vocales[2] != 0 && vocales[3] != 0 && vocales[4] != 0)
		System.out.println("Todas las vocales");
	else System.out.println("Faltan vocales");
	}

}