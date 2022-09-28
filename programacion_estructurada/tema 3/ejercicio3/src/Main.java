import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("introduce los pesetas");
        double num1 =Double.parseDouble (s.next());


        System.out.println("el cambio es  " + num1 / 166.36);
    }
}