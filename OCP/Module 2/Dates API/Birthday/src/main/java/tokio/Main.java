package tokio;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aniversário!");
        System.out.println();
        System.out.println("Vamos lá saber quanto tempo falta para o teu aniversário.");
        System.out.println("Quando é que nasceste? (yyyy-MM-dd)");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        LocalDate present = LocalDate.now();
        LocalDate birthday = LocalDate.parse(answer);
        LocalDate next = birthday.withYear(present.getYear());
        if(next.isBefore(present)) {
            next = next.plusYears(1);
            Period timeLeft = present.until(next);
            String meses = timeLeft.getMonths()>1 ? ("Faltam " + timeLeft.getMonths() + "meses e ") : ("Falta apenas " + timeLeft.getMonths() + " mês e ");
            String dias = timeLeft.getDays()>1 ? (timeLeft.getDays() + " dias ") : (timeLeft.getDays() + " dia ");
            System.out.println("Ah já celebrate o teu dia então. Agora só para o ano. " + meses + dias + "para o teu próximo aniversário.");
        }
        else if(next.isEqual(present)) System.out.println("Feliz Aniversário!");
        else {
            Period timeLeft = present.until(next);
            String meses = timeLeft.getMonths()>1 ? ("Faltam " + timeLeft.getMonths() + "meses e ") : ("Falta apenas " + timeLeft.getMonths() + " mês e ");
            String dias = timeLeft.getDays()>1 ? (timeLeft.getDays() + " dias ") : (timeLeft.getDays() + " dia ");
            String dias2 = timeLeft.getDays()>1 ? ("Faltam " + timeLeft.getDays() + " dias ") : ("Falta " + timeLeft.getDays() + " dia ");
            if(timeLeft.getMonths()>0) System.out.println("Que emocionante! " + meses + dias + "para fazeres anos!");
            else System.out.println("Wow é já este mês! " + dias2 + "para o teu aniversário!");
        }
        System.out.println();


    }
}