import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creamos y rellenamos el array
        int rows = 5;
        int columns = 6;
        int[][] matrix = new int[rows][columns];
        int[][] matrixFull=GetMatrix(matrix);
        //hacemos sumas parciales y totales.
        int sumaRows = SumaRow(matrixFull, rows, columns);
        int sumaColumns = SumaColumns(matrixFull,columns, rows);
        int sumaTotal = SumaTotal(sumaRows,sumaColumns);
        //colocamos las sumas en su respectivos huecos en el array y pintamos el array.
        int [][] matrixResult = MatrixResult(matrixFull,sumaRows, sumaColumns,sumaTotal, rows,columns);
        PaitingMatrix(matrixResult);

    }

    public static int[][] GetMatrix(int[][] matrix) {
        //Scanner scaner = new Scanner(System.in);
        int rows = 5;
        int columns = 6;
        for (int i = 0; i < rows -1; i++) {
            for (int j = 0; j < columns -1; j++) {
               //System.out.println("Dime un numero");
               // int num = scaner.nextInt();
                matrix[i][j] = i;//num;

            }

        }
        return matrix;

    }
    public static void PaitingMatrix(int[][] matrix){
        int rows = 5;
        int columns = 6;
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns ; j++) {
                System.out.print(matrix[i][j] + " ");
                System.out.printf("\t");
            }
            System.out.println();
        }
    }
    public static int SumaRow(int[][] matrixFull,int rows, int columns){
        int sumaRows = 0;
        for (int i = 0; i < rows ; i++) {

            for (int j = 0; j < columns  ; j++) {
                sumaRows+=matrixFull[i][j];
            }
        }
        System.out.println(sumaRows + " sumarows");
        return sumaRows;
    }
    public  static int SumaColumns (int[][] matrixFull, int columns, int row){
        int sumaColumns = 0;
        for (int i = 0; i < columns-1; i++) {

            for (int j = 0; j < row -1 ; j++) {
                sumaColumns+=matrixFull[i][j];
            }
        }
        System.out.println(sumaColumns + " sumacolums");
        return sumaColumns;
    }
    public  static int SumaTotal(int sumaRows, int sumaColums){
        int sumaTotal = 0;
        return sumaTotal = sumaRows  + sumaColums;

    }
    public static int[][] MatrixResult(int[][] matrixFull, int sumaRows, int sumaColumns, int sumaTotal, int row, int columns){
        for (int i = 0; i <row  ; i++) {
            for (int j = 0; j <columns ; j++) {
                if (i == matrixFull[i][j]){
                    matrixFull[i][5] = sumaRows;
                }
                if (j == matrixFull[i][j]){
                  matrixFull[4][j] = sumaColumns;
                }
            }
        }
        matrixFull[4][5] = sumaTotal;
        System.out.println(sumaTotal + " sumatotal");
        return matrixFull;
    }
}
