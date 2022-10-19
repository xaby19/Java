import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un número entero de 5 cifras como máximo");
        int num = Integer.parseInt(scanner.next());


        if((num/10) == 0) {
            System.out.println("El número tiene 1 cifra");
        }else if ((num/10) > 0 && (num/10) < 10) {
            System.out.println("El número tiene 2 cifras");
        }else if ((num/10) > 10 && (num/10) < 100) {
            System.out.println("El número tiene 3 cifras");
        }else if ((num/10) > 100 && (num/10) < 1000) {
            System.out.println("El número tiene 4 cifras");
        }else if ((num/10) > 1000 && (num/10) < 10000) {
            System.out.println("El número tiene 5 cifras");
        } else {
            System.out.println("El numero es demasiado grande, stop it12");
        }

    }
}