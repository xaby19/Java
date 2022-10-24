import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la altura: ");
        int altura = Integer.parseInt(scanner.next());
        for (int i = 1; i < altura; i++){
            for (int j = 1; j <= altura; j++){
                if ((j == 1) || (j == altura)){
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" "+ " ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i < altura; i++){
            if ((i == 1) || (i == altura)){
                System.out.print(" " + " ");
            } else {
                System.out.print("*" + " ");
            }
        }
    }
}