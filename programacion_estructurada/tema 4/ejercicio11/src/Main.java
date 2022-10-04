import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Dime la hora del dia en formatp 24h");
        int horaDia = Integer.parseInt(scanner.next());

        System.out.println("Dime los minutos");
        int minutos = Integer.parseInt(scanner.next());


        int segundosHora = horaDia * 3600;
        int segundosMin= minutos * 60;

        int segundosTotales = segundosHora + segundosMin;

        int segundosRestantes = 86400 - segundosTotales;

        System.out.println(segundosRestantes);

    }
}