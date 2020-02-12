package patrones.Observer;

public class Programa {

	public static void main(String[] args) {

		EstacionMeteorologica m1 = new EstacionMeteorologica("Madrid Centro"); 
		EstacionMeteorologica m2 = new EstacionMeteorologica("Madrid Norte");
		EstacionMeteorologica m3 = new EstacionMeteorologica("Madrid Sur"); 
		EstacionMeteorologica m4 = new EstacionMeteorologica("Madrid Este"); 
		EstacionMeteorologica m5 = new EstacionMeteorologica("Madrid Oeste");

		Pantalla p1 = new Pantalla("Pantalla 1"); //SEGUIDORA DE 3 ESTACIONES -> M1, M4 Y M5.
		Pantalla p2 = new Pantalla("Pantalla 2"); //SEGUIDORA DE 2 ESTACIONES -> M1, M2.
		Pantalla p3 = new Pantalla("Pantalla 3"); //SEGUIDORA DE 2 ESTACIONES -> M2, M3.

		m1.añadirObservador(p1); 
		m1.añadirObservador(p2);
		m2.añadirObservador(p2); 
		m2.añadirObservador(p3);
		m3.añadirObservador(p3); 
		m4.añadirObservador(p1); 
		m5.añadirObservador(p1);

		
		m1.mensaje("Día de frio y lluvia en el centro"); // notificas de este cambio a p1 y p2 (tus seguidoras/ observadoras)
		m2.mensaje("Las lluvias remiten en el norte");
		m3.mensaje("Despejado en el sur");
		m4.mensaje("Dia ventoso en el este");
		m5.mensaje("Dia desapacible en el oeste");

		m1.eliminarObservador(p2);

		m1.mensaje("Sube la temperatura en el centro"); 
		
	}
}