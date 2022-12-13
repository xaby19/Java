import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una frase");
        String s = scanner.nextLine();
        System.out.println("Dime un caracter de la frase");
        char ch1 = scanner.next().charAt(0);
        System.out.println("Dime un caracter, para sustituir el anterior");
        char ch2 = scanner.next().charAt(0);
        System.out.println(SustituyeCaracter(s,ch1,ch2));
    }
    public static String SustituyeCaracter(String s, char ch1, char ch2){
        return s.replace(ch1, ch2);
    }
}