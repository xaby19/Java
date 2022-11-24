import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int[] ArrayTemperaturas = getArrayTemperaturas(12);
        DiagramaOfArray(ArrayTemperaturas);
    }

    private static int[] getArrayTemperaturas(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayTemps = new int[size];
        int length = arrayTemps.length;

        for (int i = 0; i < length ; i++) {
            System.out.println("Dime la temperatura media de cada mes " + (i + 1) + " del año");
            arrayTemps[i] = Math.round(scanner.nextInt());
        }
        return arrayTemps;
    }

    public static void DiagramaOfArray(int[] arrayTemps){
        for (int i = 0; i < arrayTemps.length ; i++) {
            System.out.printf("%02d ", i +1);
            for (int j = 0; j <arrayTemps[i] ; j++) {
                System.out.print( " * ");
            }
            System.out.println();
        }
    }
}