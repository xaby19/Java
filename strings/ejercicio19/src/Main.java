import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una frase y la invierto");
        String s = scanner.nextLine();
        System.out.println(InviertePalabra(s));
    }
    public static String InviertePalabra (String s){

        String result = "";

        for (int i = s.length() - 1; i >= 0; i--) {

           result += s.charAt(i);
        }


        return result;
    }
}