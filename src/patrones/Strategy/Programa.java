package patrones.Strategy;
/*
 * Mismas condiciones, segun las estrategias varia el resultado.
 */

public class Programa {
	public static void main(String[] args) {

		CondicionesTiempo t1 = new CondicionesTiempo(25, 40, new MaratonStrategy());
		CondicionesTiempo t2 = new CondicionesTiempo(15, 50, new SenderismoStrategy()); 
		CondicionesTiempo t3 = new CondicionesTiempo(-5, 50, new SenderismoStrategy());


		System.out.println(((t1.getRecomendacion() ? "Se aconseja" : "Evite")) + " correr un maratón con " + t1.getTemperatura() +
				"oC y " + t1.getHumedad() + "% humedad"); 

		System.out.println(((t2.getRecomendacion() ? "Se aconseja" : "Evite"))
				+ " hacer senderismo con " + t2.getTemperatura() + " oC y " + t2.getHumedad() + "% humedad");

		t2.setEstrategia(new MaratonStrategy());

		System.out.println(((t2.getRecomendacion() ? "Se aconseja" : "Evite")) + " correr un maratón con " + t2.getTemperatura() +
				"oC y " + t2.getHumedad() + "% humedad");

		System.out.println(((t3.getRecomendacion() ? "Se aconseja" : "Evite")) + " hacer senderismo con " + t3.getTemperatura() +
				"oC y " + t3.getHumedad() + "% humedad"); 

		t3.setEstrategia(new MaratonStrategy());

		System.out.println(((t3.getRecomendacion() ? "Se aconseja" : "Evite")) + " correr un maratón con " + t3.getTemperatura() +
				"oC y " + t3.getHumedad() + "% humedad"); 

		t3.setEstrategia(new GimnasioStrategy());

		System.out.println(((t3.getRecomendacion() ? "Se aconseja" : "Evite")) + " ir al gimnasio con " + t3.getTemperatura() +
				"oC y " + t3.getHumedad() + "% humedad");
	}
}