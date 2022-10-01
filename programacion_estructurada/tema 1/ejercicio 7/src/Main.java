import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
            Ejemplo n = 5
             _____*
             ____*_*
             ___*___*
             __*_____*
             _*_______*
             ***********
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dame un entero y te pinto una pirámide de ese tamaño: ");
        int n = scanner.nextInt();

        // First row
        System.out.println(" ".repeat(n) + "*");

        for (int row = 1; row < n; row++) {
            printLeftSpaces(n, row);
            printContent(row);
            System.out.println();
        }

        // Last row
        System.out.println("*".repeat((n * 2 ) + 1));
    }

    private static void printLeftSpaces(int n, int row) {
        System.out.print(" ".repeat(n - row));
    }

    private static void printContent(int row) {
        System.out.print("*" + " ".repeat((row * 2) - 1) + "*");
    }

}