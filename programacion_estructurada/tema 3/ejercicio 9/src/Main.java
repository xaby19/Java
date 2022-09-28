import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.println("Dime la altura del cono");
        double altura = Double.parseDouble(s.next());

        System.out.println("Dime el radio del cono");
        double radio = Double.parseDouble(s.next());

         double pi = 3.14;
        double area = ((pi / 3) *(radio*radio) * altura);
        System.out.println("El area del cono es " + area);

    }
}