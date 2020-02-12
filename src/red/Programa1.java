package red;

import objetos.Persona;

public class Programa1 {

	public static void main(String[] args) {
		
		Red clase = new Red("Amigos d clase");
		/*
		
		clase.añadirPersonas(new Persona("1", "Carlos", "Martin", 20, 4, 1993, "7657643897"));
		clase.añadirPersonas(new Persona("1", "Carlos", "Martin", 20, 4, 1993, "7657643897"));
		clase.añadirPersonas(new Persona("1", "Carlos", "Martin", 20, 4, 1993, "7657643897"));
		clase.añadirPersonas(new Persona("1", "Carlos", "Martin", 20, 4, 1993, "7657643897"));
		
		clase.mostrarPersonas();
		
		
		
		colegio.añadirPersonas(new Persona("1", "Carlos", "Martin", 20, 4, 1993, "7657643897"));
		colegio.añadirPersonas(new Persona("1", "Carlos", "Martin", 20, 4, 1993, "7657643897"));
		colegio.añadirPersonas(new Persona("1", "Carlos", "Martin", 20, 4, 1993, "7657643897"));
		colegio.añadirPersonas(new Persona("1", "Carlos", "Martin", 20, 4, 1993, "7657643897"));
		*/
		Red colegio = new Red("Amigos del colegio");
		
		colegio.mostrarPersonas();

	}

}
