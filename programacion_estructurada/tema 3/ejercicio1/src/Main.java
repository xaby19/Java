import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("introduce un numero");
        int num1 =Integer.parseInt (s.next());

        System.out.println("introduce un numero");
        int num2 =Integer.parseInt (s.next());
        System.out.println("multiplicamos los numeros dados " + num1 * num2);
    }
}