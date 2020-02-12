package objetos;

public class Programa2 {
	
	public static void main(String[] args) {
		Persona[] amigos = new Persona[5];
		
		Persona gonzalo = new Persona("1", "Gonzalo", "Robledo", 24, 5, 1996, "671869415");
		Persona daniel = new Persona("2", "Daniel", "Robledo", 20, 8, 1994, "6745669415");
		
		amigos[0] = gonzalo;
		amigos[1] = daniel;
		amigos[3] = new Persona("3", "retreg", "Robsdf", 20, 8, 1994, "6745669415");
		amigos[4] = new Persona("4", "Dawertel", "Robrdgto", 20, 8, 1994, "6745234765");
		
		//for ascendente
		System.out.println("\nMis amigos(ascendente)\n");
		
		for(int i = 0; i <= amigos.length; i++) {
			System.out.println(amigos[i].getDatos());
		}	
		//for descendente
		System.out.println("\nMis amigos(descendente)\n");
		
		for(int i = amigos.length -1; i >= 0; i--) {
			System.out.println(amigos[i].getDatos());
		}
		//for para todo
		System.out.println("\nMis amigos(descendente)\n");
		
		for(Persona p : amigos) {
			System.out.println(p.getDatos());
		}
		//imprimir los de 20 AÑOS
		for(Persona p : amigos) {
			if(p.getEdad()== 20)
				System.out.println(p.getDatos());
		}
		//imprimir los entre 24 y 25
		for(Persona p : amigos) {
			if(p.getEdad()>= 24 && p.getEdad() <= 25)
				System.out.println(p.getDatos());
		}	
	}
}
