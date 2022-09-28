import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Dime el precio sin IVA");
        double baseImponible = Double.parseDouble(s.next());
        double iva = 1.21;
        double result = baseImponible * iva;
        System.out.println("El precio total es " + result);
    }
}