import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un numero");
        int num = Integer.parseInt(scanner.next());

        int cuadrado = 0;
        int cubo = 0;

        for (int i = 1; i <= 5 ; i++) {

            cuadrado = num * num;
            cubo = num * num * num;
            num++;
            System.out.println("el Numero " + num + "\t El cuadado es " + cuadrado +
                    "\tEl cubo es " + cubo);

        }


    }
}