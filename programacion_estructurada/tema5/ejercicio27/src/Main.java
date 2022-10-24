import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dime un numero");
        int numeroAFactorizar = Integer.parseInt(scanner.next());
        int factorial = 1;
        for (int i = numeroAFactorizar; i > 0  ; i--) {
            factorial *= i;

        }
        System.out.printf("El factor %s. es igual a %s.", numeroAFactorizar, factorial);

    }
}