import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random= new Random();
        int[][] array = new int[4][5];
        int total = 0;

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {

                array[i][j] = random.nextInt(100) + 100;
            }
            System.out.println();
        }

        System.out.printf("%sTotal row\n", " ".repeat(array.length * 6));


        for (int[] row : array) {
            int rowSubtotal = 0;

            for (int n : row) {
                System.out.printf("%3d ", n);
                total +=n;
                rowSubtotal += n;
            }
            System.out.printf("%5d\n", rowSubtotal);
        }

        System.out.printf("%s\n", "-".repeat(array.length * 6));
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int columnSubtotal = 0;
            for (int j = 0; j < length; j++) {
                columnSubtotal += array[j][i];
            }
            System.out.printf("%4d", columnSubtotal);

        }
        System.out.print("  total =  ");
        System.out.print(array[3][4] = total );

        System.out.println();


    }
}
