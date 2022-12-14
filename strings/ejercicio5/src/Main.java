import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("dime un caracter: ");
        char c = scanner.next().charAt(0);
        System.out.print("Dime las veces que serepite el caracter: ");
        int n = scanner.nextInt();
        System.out.println(RepiteCaracter(c,n));
    }
    public static String RepiteCaracter (char c, int n){
        String result = "";

        for (int i = 0; i < n; i++)
        {
            result += c;
        }

        return result;
    }
}