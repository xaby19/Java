import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una palabra o frase");
        s = scanner.nextLine();
        System.out.println(NumbersViwels(s));
    }

    public static int NumbersViwels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isViwel(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static boolean isViwel(char c) {

        if (!(Character.isLetter(c))) {
            return false;
        }
        Character.toLowerCase(c);
        String aux = "aeiouáéíóú";
        return aux.indexOf(Character.toLowerCase(c)) != -1;
    }
}