import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una palabra");
        String s = scanner.nextLine();
        System.out.println("Dime un numero de pading");
        int n = scanner.nextInt();
        System.out.println(PadR(s,n));
    }
    public static String PadR (String s, int n){
        String result = "";
        for (int i = 0; i < n -s.length() ; i++) {
            char c = s.charAt(i);
            if (!IsLetter(c)){
                result += " ";
            }
            else {
                result+= s;
            }
        }
        return result;
    }
    public static boolean IsLetter (char c){
        boolean result = false;
        if (Character.isLetter(c)){
            result = true;
        }
        return result;
    }
}