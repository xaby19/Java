import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una frase");
        String s = scanner.nextLine();
        System.out.println("Dime el caracter que quieres saber cuanto se repite");
        char c = scanner.next().charAt(0);
        System.out.println(VecesCaracter(s,c));
    }
    public static int VecesCaracter(String s, char c){
        int result = 0;

        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == c)
            {
                result++;
            }
        }

        return result;
    }
}