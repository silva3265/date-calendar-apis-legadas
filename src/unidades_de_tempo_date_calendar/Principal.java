package unidades_de_tempo_date_calendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws ParseException {
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Data de nascimento: ");
		String dataAniversarioTexto = scanner.nextLine();

		Date dataNascimento = formatador.parse(dataAniversarioTexto);

		Calendar calendar = Calendar.getInstance(); /* ele vai pegar a instancia de um calendario nesse exato momento  */
		calendar.setTime(dataNascimento); /* ele altera os campos internamente do calendar */

		System.out.println(calendar.getTime()); // Vai retornar um date

		/* Logica para saber se essa data vai cair no Natal */
		if (calendar.get(Calendar.MONTH) == Calendar.DECEMBER && calendar.get(Calendar.DAY_OF_MONTH) == 25) { /* MONTH - são constantes */
			System.out.println("Você nasceu no Natal! Ho ho ho");
		} else if (calendar.get(Calendar.DAY_OF_YEAR) == 256) { /* DAY_OF_YEAR - vai contando o dia do ano */
			System.out.println("Você nasceu no dia do programador! Hello world");
		}
	}

}
