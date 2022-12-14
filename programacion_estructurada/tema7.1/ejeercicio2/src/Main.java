import java.util.Scanner;
/*
Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[4][5];
        int total = 0;

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print("dime un numero: ");
                array[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        System.out.printf("%sTotal row\n", " ".repeat(array.length * 6));

        for (int[] row : array) {
            int rowSubtotal = 0;

            for (int n : row) {
                System.out.printf("%4d ", n);
                total +=n;
                rowSubtotal += n;
            }
            System.out.printf("%4d\n", rowSubtotal);
        }

        System.out.printf("%s\n", "-".repeat(array.length * 5));
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int columnSubtotal = 0;
            for (int j = 0; j < length; j++) {
                columnSubtotal += array[j][i];
            }
            System.out.printf("%4d", columnSubtotal);

        }
        System.out.println();
        System.out.printf("%2d",  array[3][4] = total);

    }
}
