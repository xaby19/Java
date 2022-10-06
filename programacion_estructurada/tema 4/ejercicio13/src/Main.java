import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un numero: ");
        int n1 = Integer.parseInt(scanner.next());

        System.out.println("Dime otro numero: ");
        int n2 = Integer.parseInt(scanner.next());

        System.out.println("Dime el último numero: ");
        int n3 = Integer.parseInt(scanner.next());

        int max = n1;
        int temp = 0;

        if (n1 > n2) {
            temp = n1;
            n1 = n2;
            n2 = temp;
        }
        if (n2 > n3) {
            temp = n2;
            n2 = n3;
            n3 = temp;
        }
        if (n1 > n2) {
            temp = n1;
            n1 = n2;
            n2 = temp;
        }
        System.out.println(n1 + "," + n2 + "," + n3);
    }
}