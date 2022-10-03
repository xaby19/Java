import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime una nota");
        int notaUno = Integer.parseInt(scanner.next());

        System.out.println("Dime otra nota");
        int notaDos = Integer.parseInt(scanner.next());

        System.out.println("Dime la nota");
        int notaTre = Integer.parseInt(scanner.next());

        System.out.println("La nota meida es: " + (notaUno + notaDos + notaTre) / 3);


    }
}