import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime una frase: ");
        String s = scanner.nextLine();
        int numero;

        if (!isNumeric(s)) {
            System.out.println("no es un numero");
        } else {
            numero = Integer.parseInt(s);
            System.out.println("Numero: " + numero);
        }
    }
    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
}