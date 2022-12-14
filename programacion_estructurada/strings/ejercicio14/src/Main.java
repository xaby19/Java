import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Dime una frase y la invertire");
        String s = scaner.nextLine();
        System.out.println(InvierteCadena(s));
    }
    public static String InvierteCadena(String s){

        String result = "";

        for (int i = s.length() - 1; i > -1 ; i--)
        {
            result += s.charAt(i);
        }

        return result;
    }
}