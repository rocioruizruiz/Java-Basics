package fundamentos;

import java.util.Scanner;

public class FraseAlReves {

	public static void main(String[] args) {
		Scanner entradaConsola = new Scanner(System.in);
		
		System.out.print("Introduzca una palabra: ");
		String frase = entradaConsola.nextLine();         //lee toda la linea hasta meter un enter

		String fraseMinusculas = frase.toLowerCase();
		String fraseSinEspacios = "";
		for(int i = 0; i < fraseMinusculas.length() ; i++) {
			if(fraseMinusculas.charAt(i) != ' ') {
				fraseSinEspacios = fraseSinEspacios + fraseMinusculas.charAt(i);
			}
		}
		System.out.println("La frase es: " + frase );
		String invertida = "";
		for(int i = fraseSinEspacios.length()-1; i>=0; i--) {
			invertida = invertida + fraseSinEspacios.charAt(i);
		}
		System.out.println("La frase invertida es: " + invertida );
		System.out.println(fraseSinEspacios + invertida);
		
		/*
		if(invertida == fraseSinEspacios)
			System.out.println("Es palindromo! ");
		else
			System.out.println("No es palindromo! ");
			*/

	}

}
