import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el numero que deseas multiplicar");
        int numMulti = Integer.parseInt(scanner.next());

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(numMulti + " X " + i+ " = " + i*numMulti);
        }
    }
}