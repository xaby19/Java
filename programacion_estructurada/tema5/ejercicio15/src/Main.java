import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Dime un numero para la  base");
        int base = Integer.parseInt(scanner.next());

        System.out.println("Dime un numero para el exponente");
        int exponente = Integer.parseInt(scanner.next());

        int resultado = 1;
        for (int i = 1; i <= exponente ; i++) {

            resultado *= base;

            System.out.println( base + "^"+ i + " = " + resultado);
        }


    }
}