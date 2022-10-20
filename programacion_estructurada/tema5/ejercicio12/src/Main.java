import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el numero total a mostrar");
        int serie = Integer.parseInt(scanner.next());
        int num1 = 1, num2 = 2, suma = 1;

        for (int i = 1; i <= serie ; i++) {

            suma = num1 + num2;
            num1 = num2;
            num2 = suma;

            System.out.print( fibonacciRecursivo(i) + " ");
        }
    }

    static int fibonacciRecursivo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }
}