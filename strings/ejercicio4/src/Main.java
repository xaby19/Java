import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una frase");
        String input = scanner.nextLine();
        System.out.println("Dime un caracter");
        char c = scanner.next().charAt(0);
        if (ThisContain(input, c)) {
            System.out.println("el caracter Si, esta contenido en el String");
        } else {
            System.out.println("el caracter No, esta contenido en el String");
        }
    }

    public static boolean ThisContain(String s, char ch) {
      boolean result = s.indexOf(ch) != -1;

        return result;
    }
}

