package comparando_datas_com_date;

import java.util.Date;

public class Principal {

    public static void main(String[] args) {
        Date hoje = new Date();
        Date ontem = new Date(System.currentTimeMillis() - (24 * 60 * 60 * 1000));

        long diferencaMillis = hoje.getTime() - ontem.getTime(); /* vai calcular 'hoje - ontem' */
        System.out.println(diferencaMillis);

        double diferencaHoras = diferencaMillis / 1000 / 60 / 60d;

        System.out.printf("Diferença em horas: %.2f%n", diferencaHoras);

        System.out.printf("Depois: %b%n", hoje.after(ontem)); /* essa data é Depois de ontem? */
        System.out.printf("Antes: %b%n", hoje.before(ontem)); /* essa data é Antes de ontem? */
        System.out.printf("Comparação: %d%n", hoje.compareTo(ontem)); /* vai comparar se as datas é maior que outra */
    }

}
