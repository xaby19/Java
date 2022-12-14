import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dime una palabra");
        String s = scanner.nextLine();
        System.out.println(QuitaEspaciosSobrantes(s));
    }
    public static String QuitaEspaciosSobrantes(String s){
        String result = "";
        s.trim();
      if( IsWhiteSpace(s)&&(IsWhiteSpace(s+1))){
          result = s.replace(" ", "");
      }
      else if ((IsWhiteSpace(s)&&(IsLetter(s +1)))){
          result += s;
        }
      return  result;
    }
    public static boolean IsLetter(String c){
        boolean result = Character.isLetter(Integer.parseInt(c));
        return result;
    }
    public static boolean IsWhiteSpace(String c){
        boolean result = Character.isWhitespace(Integer.parseInt(c));
        return result;
    }
}