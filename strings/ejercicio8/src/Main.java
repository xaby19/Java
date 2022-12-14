import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una frase");
        String s = scanner.nextLine();
        System.out.println(QuitaEspaciosTrim(s));
    }
    public static String QuitaEspaciosTrim(String s){
      String result = s.replace(" ", "");

        return result;
    }
}