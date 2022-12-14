import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dime una frase");
        String s = scanner.nextLine();
        System.out.println("Dime una palabra de la frase que se repita");
        String word = scanner.nextLine();
        System.out.println(VecesPalabra(s,word));
    }
    public static int VecesPalabra ( String s, String word){
        int result = 0;
        String s2 = "";
        String[] a;

        for (int i = 0; i < s.length(); i++)
        {
            if (Character.isLetter(s.charAt(i)) || Character.isWhitespace(s.charAt(i)))
            {
                s2 += s.charAt(i);
            }
        }

        s2 = s2.trim();

        a = s2.split(" ");

        for (String item:a) {

            if (item.equals(word))
            {
                result++;
            }
        }

        return result;
    }

}