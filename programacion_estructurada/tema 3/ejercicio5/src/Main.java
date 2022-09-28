import java. util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Dime la base del rectangulo");
        double base = Double.parseDouble(s.next());

        System.out.println("Dime la altura del rectangulo");
        double altura= Double.parseDouble(s.next());

        double area = base * altura;

        System.out.println(area);
    }
}