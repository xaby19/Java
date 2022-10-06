import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime una cifra de hasta 5 cifras");
        int cifra = Integer.parseInt(scanner.next());



        if (cifra >0 || cifra > 100000 ) {
            if (cifra < 10) {
                System.out.println("el numero de cifras es " + cifra);
            } else if (cifra > 10 && cifra < 100) {
                System.out.println("el numero de cifras es " + cifra / 10);
            } else if (cifra > 100 && cifra < 1000) {
                System.out.println("el numero de cifras es " + cifra / 100);
            } else if (cifra > 1000 && cifra < 10000) {
                System.out.println("el numero de cifras es " + cifra / 1000);
            } else {
                System.out.println("Sunumero es de 5 cifras");
            }
        }
    }
}