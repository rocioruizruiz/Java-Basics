package genericos;
public class TestImprimeVectorGenerico {
   
	private static void imprimeVector(Integer [] vector) {
		System.out.println("Vector de integer { " );
		for(Integer elemento : vector) {
			System.out.println(elemento + " ");
		}
		System.out.println("}");
	}
	
	private static void imprimeVector(String [] vector) {
		System.out.println("Vector de String {");
		for(String elemento : vector) {
			System.out.println( elemento + " ");
		}
		System.out.println("}");
	}
	
	private static <T> void imprimeVector(T [] vector) {
		System.out.println("Vector generico {");
		
		for(T elemento : vector) {
			System.out.println(elemento + " ");
		}
		System.out.println("}");
	}
	
	public static void main(String [] args) {
		
		Integer    [] numeros  = {2,3,5,7,8,9,10};
		String     [] vocales  = {"a", "e", "i","o","u"};
		Character  [] letras   = {'A', 'B', 'C','D'};
		Double     [] factores = { 1.5 , 4.6 , 9.7 ,5.5};
		
		imprimeVector(numeros);
		imprimeVector(vocales);
		imprimeVector(letras);
		imprimeVector(factores);
	}
	
}
