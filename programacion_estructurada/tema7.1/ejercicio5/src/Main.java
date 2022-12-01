import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int rows = 6;
        int columns = 10;

        int max = 0;
        int positionRowsMax = 0;
        int positionColumnsMax = 0;

        int min = 500;
        int positionRowMin = 0;
        int positionColumsMin = 0;

        Random random = new Random();
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(1001);
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    positionColumnsMax=j;
                    positionRowsMax = i;
                }
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    positionRowMin = i;
                    positionColumsMin = j;
                }
                System.out.printf("%9d", matrix[i][j]);
            }
            System.out.println();

        }
        System.out.println(max + " es el maximo y su posicion es... x: " + positionRowsMax + " y: " + positionColumnsMax);
        System.out.println(min + " ses el maximo y su posicion es... x: " + positionRowMin+ " y: " + positionColumsMin);

        }

    }
