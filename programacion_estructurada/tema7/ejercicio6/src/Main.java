import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] leeArray = CreaArray(15);
        EscribeArray(leeArray);
        System.out.println();
        int[] rotaArray = getRotaArray(leeArray);
        EscribeArray(rotaArray);
    }
    static int[] CreaArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[size];
        int length = array.length;

        for (int i = 0; i < length ; i++) {
            System.out.print("Dime un numero: ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int[] getRotaArray( int[] array) {
        int length = array.length;
        int valorDeCero = array[length - 1];//variable aux. para mantener el valor.

        for (int j = length - 1; j >= 1; j--) {

            array[j] = array[j - 1];

        }
        array[0] = valorDeCero;

        return array;
    }

    static void EscribeArray(int[] array){

        for (int j : array) {

            System.out.print(j + " ");
        }
    }
}