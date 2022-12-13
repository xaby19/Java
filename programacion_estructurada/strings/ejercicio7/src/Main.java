import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime una frase: ");
        String s = scanner.nextLine();
        System.out.println(QuitaEspacios(s));
    }
    public static String QuitaEspacios (String s)
    {
       String result = s.replace(" ", "");

        return result;
    }
}