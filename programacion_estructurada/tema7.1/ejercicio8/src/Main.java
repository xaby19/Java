import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("necesito la posicion del alfil en el tablero");
        System.out.print("Dime la x; del 1 al 8: ");
        int row = scanner.nextInt() ;
        System.out.print("Dime la y; del 1 al 8: ");
        int column = scanner.nextInt() ;
        int[][] tableChees = new int[8][8];
        int[][] alfil = new int[row][column];
        int k = 1;
        for (int i = 0; i < tableChees.length ; i++) {
            for (int j = 0; j <tableChees[i].length ; j++) {
                if ((alfil[i+k][(j-i)]!= tableChees.length||(alfil[i+k][j+k]!= tableChees.length)||(alfil[i-k][j-k]!= tableChees.length)||(alfil[i-k][j+k]!= tableChees.length))){
                    System.out.println(i);
                    System.out.println(j);
                }

            }
        }


    }
}