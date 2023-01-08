package pag139a142_modulos.src.mod1.arq.src;

import java.util.Calendar;

public class Serv {
	public static String cumprimento() {
		var cal = Calendar.getInstance();
		int hora = cal.get(Calendar.HOUR_OF_DAY);
		if (hora>18) {
			return "Boa noite";
		} else if (hora > 12) {
			return "Boa tarde";
		}
		return "Bom dia";
	}
}