package patrones.FactoryMethod;

import java.util.Calendar;

public class Reloj12H extends Reloj {

	public String getHora() {

		Calendar hora = Calendar.getInstance();

		String hora12H = ((hora.get(Calendar.HOUR) < 10) ? "0" : "") +
				hora.get(Calendar.HOUR) + ":" + 
				((hora.get(Calendar.MINUTE) < 10) ? "0" : "") +
				hora.get(Calendar.MINUTE) + ":"  +
				((hora.get(Calendar.SECOND) < 10) ? "0" : "") +
				hora.get(Calendar.SECOND);

		return (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) ? (hora12H + " AM") : hora12H + " PM";
	}

}

