import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una frase");
        String s = scanner.nextLine();
        System.out.println(MayusculaPrimera(s)); // algo falla y no se porque
    }
    public static String MayusculaPrimera (String s)
    {
        String result = "";

        for (int i = 0; i <s.length() ; i++){

            Character.toLowerCase(s.charAt(i));

            if (Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i - 1))){
               Character.toLowerCase(s.charAt(i));
               result += s.charAt(i);
            }
            else {
                result += s.charAt(i);
            }
        }
        return result;
    }



}