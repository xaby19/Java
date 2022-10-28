import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        int length = array.length, min,max;


        for (int i = 0; i < length ; i++) {
            System.out.println("Dime un numero");
            array[i] = scanner.nextInt();
        }

        min = max = array[0];

        for (int j = 0; j <length ; j++) {
            if (max < array[j]) {
                max = array[j];

            }
            if (min > array[j]) {
                min = array[j];
            }
            System.out.print(array[j] + " ");
        }

        System.out.println("\n El maximo es: " + max + " y el minimo es " + min);


    }
}