import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("introduce un número, que será la altura de la L: ");
        int altura = Integer.parseInt(scanner.next());

        for (int col = 1; col < altura; col++) {
            System.out.println("*");
        }
        for (int row = 0; row < (altura/2)+1; row++) {
            System.out.print("* ");
        }
    }
}