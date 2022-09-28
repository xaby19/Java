import java. util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Dime la base del trinangulo");
        double base = Double.parseDouble(s.next());

        System.out.println("Dime la altura del triangulo");
        double altura = Double.parseDouble(s.next());

        double area = (base * altura) / 2;

        System.out.println(area);
    }
}