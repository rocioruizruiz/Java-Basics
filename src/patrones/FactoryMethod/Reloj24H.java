package patrones.FactoryMethod;


import java.util.Calendar;
public class Reloj24H extends Reloj {
	public String getHora() {
		Calendar hora = Calendar.getInstance();
		return ((hora.get(Calendar.HOUR_OF_DAY) < 10) ? "0" : "") + hora.get(Calendar.HOUR_OF_DAY) + ":" + 
				((hora.get(Calendar.MINUTE) < 10) ? "0" : "") + hora.get(Calendar.MINUTE) + ":" +
				((hora.get(Calendar.SECOND) < 10) ? "0" : "") + hora.get(Calendar.SECOND);
	}
}
