import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dime el primer dia (1-7): ");
        int dayOne = scanner.nextInt();

        System.out.print("Dime la primera hora (0-23): ");
        int hourOne = scanner.nextInt();

        System.out.print("Dime el segundo dia (1-7), tiene que ser mayor que el primero: ");
        int dayTwo = scanner.nextInt();

        System.out.print("Dime la segunda hora (0-23): ");
        int hourTwo = scanner.nextInt();


        if (dayOne < dayTwo){
            int difereciaDeDias;
            int diferenciaHoras;
            difereciaDeDias = (dayTwo - dayOne) * 24;
            diferenciaHoras = hourTwo - hourOne;
            int result;
            result = difereciaDeDias + diferenciaHoras;
            System.out.printf("El primer dia es %s y el segundo es %s, la diferencia de horas entre esos dos días es: %shs. ", dayOne, dayTwo,result);
        }
        else{
            System.out.println("El primer día debe ser menor al segundo");
        }
    }
}