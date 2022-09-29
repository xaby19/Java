import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime la primera nota");
        double nota1 = Double.parseDouble(scanner.next());
        System.out.println("Dime la otra nota");
        double nota2 = Double.parseDouble(scanner.next());
        System.out.println("Dime la utima nota");
        double nota3 = Double.parseDouble(scanner.next());
        double numeroNotas = 3;
        double result = (nota1 + nota2 + nota3) / numeroNotas;

        System.out.println("la media de las notas es " + result);
    }
}