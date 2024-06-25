package calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ComparandoDatas {
	
	public static void main(String[] args) {
		Calendar minhaDataNascimento = new GregorianCalendar(1981, Calendar.SEPTEMBER, 13);
		Calendar dataNascimentoJoao = new GregorianCalendar(1981, Calendar.SEPTEMBER, 20);

		if (dataNascimentoJoao.after(minhaDataNascimento)) { /* verificação de joão é mais velho */
			System.out.println("João é mais velho");
		}

		if (dataNascimentoJoao.before(minhaDataNascimento)) { /* verificação de joão é mais novo */
			System.out.println("João é mais novo");
		}

		if (dataNascimentoJoao.compareTo(minhaDataNascimento) == 0) { /* verificação se joao nasceu no mesmo dia */
			System.out.println("João nasceu no mesmo dia");
		}
	}

}
