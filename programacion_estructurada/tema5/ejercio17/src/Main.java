import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Dime un numero");
        int num = Integer.parseInt(scanner.next());

        if (num > 0){
            for (int i = num; i <= 10 ; i++) {

                num += i;

            }
            System.out.println("La suma es " + num);
        }
        else {
            System.out.println("Introduce un numero prositivo");
        }
    }
}