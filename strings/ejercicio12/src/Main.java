import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una frase");
        String s = scanner.nextLine();
        System.out.println("Dime el caracter que desas quitar");
        char c = scanner.next().charAt(0);
        System.out.println(QuitaCaracter(s,c));
    }
    public static String QuitaCaracter(String s, char c){
        char blank = ' ';
        return s.replace(c,blank);
    }
}