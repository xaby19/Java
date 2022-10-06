import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("dime una cifra");
        int cifra = Integer.parseInt(scanner.next());

        cifra   %= 10;

        System.out.println("La ultima cifra es " + cifra);

    }
}