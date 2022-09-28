import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Dime un numero");
        double x = Double.parseDouble(s.next());

        System.out.println("Dime otro numero");
        double y = Double.parseDouble(s.next());

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
    }
}