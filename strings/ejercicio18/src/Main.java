import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una frase");
        String s = scanner.nextLine();
        System.out.println("Sime una palabra de la frase");
        String word1 = scanner.next();
        System.out.println("Dime una palabra sustituta");
        String word2 = scanner.next();
        System.out.println(SustituyePalabra(s,word1,word2));
    }
    static String SustituyePalabra (String s, String word1, String word2)
    {
        String result = "";
        result = s.replace(word1, word2);

        return result ;
    }

}