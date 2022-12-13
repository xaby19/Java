
    import java.util.HashSet;
    import java.util.Random;
    import java.util.Set;

    public class Main {
        public static void main(String[] args) {
            int rows = 6;
            int columns = 10;
            int [] n = new int[rows*columns];
            int max = 0;
            int positionRowsMax = 0;
            int positionColumnsMax = 0;

            int min = 1000;
            int positionRowMin = 0;
            int positionColumsMin = 0;

            Random random = new Random();
            int[][] matrix = new int[rows][columns];

            Set<Integer> generados = new HashSet<>();
            for (int i = 1; i <= 60; i++) {
                int aleatorio = -1;
                boolean generado = false;
                while (!generado) {
                    int posible = random.nextInt(1001);
                    if (!generados.contains(posible)) {
                        generados.add(posible);
                        aleatorio = posible;
                        generado = true;
                        n[i -1] = aleatorio;
                    }
                }

            }
            int cursor = 0;
            for (int i = 0; i < rows; i++) {

                for (int j = 0; j < columns; j++) {
                    matrix[i][j]= n[cursor];
                    cursor++;
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
