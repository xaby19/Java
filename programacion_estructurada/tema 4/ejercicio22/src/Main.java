import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
        String diaSemana = scanner.next();

        int diaNum = 0;

        switch(diaSemana) {
            case "lunes":
                diaNum = 0;
                break;
            case "martes":
                diaNum = 1;
                break;
            case "miércoles":
                diaNum = 2;
                break;
            case "jueves":
                diaNum = 3;
                break;
            case "viernes":
                diaNum = 4;
                break;
            default:
                System.out.print("Este dia no es valido en este programa.");
        }

        System.out.println("A continuación introduzca la hora (hora y minutos)");

        System.out.print("Hora: ");
        int horas = Integer.parseInt(scanner.next());

        System.out.print("Minutos: ");
        int min = Integer.parseInt(scanner.next());

        int minTotal = (4*24*60)+(15*60);
        int minActual = (diaNum*24*60)+(horas*60)+min;

        System.out.print("Faltan "+(minTotal-minActual)+" min para el fin de semana");
    }
}