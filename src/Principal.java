import java.util.Date;

public class Principal {

    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis());

//        Date data = new Date(); /* vai pegar a data/hora precisa */
        Date data = new Date(System.currentTimeMillis() - (24 * 60 * 60 * 1000));
        System.out.println(data);

//        System.out.println(data.getMonth()); /* esse metodo vai pegar o mes */
//        System.out.println(data.getYear()); /* esse metodo vai pegar o ano */
    }

}
