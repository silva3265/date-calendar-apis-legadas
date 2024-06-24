package datas_para_string;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Principal {

	public static void main(String[] args) {
		Date hoje = new Date();

//        DateFormat formatador = DateFormat.getDateInstance(); /* Instancia de um formatador de data padrão */
//        DateFormat formatador = DateFormat.getDateTimeInstance(); /* vai mostrar a data e a hora */
//        DateFormat formatador = DateFormat.getTimeInstance(); /* vai mostrar somente o horario */
//        DateFormat formatador = DateFormat.getDateTimeInstance(
//                DateFormat.FULL, DateFormat.FULL, new Locale("pt", "BR")); /* modelo antigo usando enums */

		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); /* SimpleDateFormat - ele recebe a data atraves de Strings */

		System.out.println(formatador.format(hoje));
	}

}
