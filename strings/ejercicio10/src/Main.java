import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una frase");
        String s = scanner.nextLine();
        System.out.println("El numero de palabras es: " + CuentaPalabras(s));
    }
    public static int CuentaPalabras(String s){
        StringTokenizer st = new StringTokenizer(s);
       int n = st.countTokens();
        return n;
    }
}