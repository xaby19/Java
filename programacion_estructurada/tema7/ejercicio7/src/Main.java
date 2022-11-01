import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] leeArray = getLeeArray(100);
        EscribeArray(leeArray);

        System.out.print("Dime el numero que quieres sulbstituir (0-20): ");
        int numeroASubstituir = scanner.nextInt();
        System.out.print("Dime el numero que sustituira al primer numero (0-20): ");
        int numeroSubstituto = scanner.nextInt();

        ItercambioNumero(leeArray, numeroASubstituir, numeroSubstituto);
    }

    public static int[] getLeeArray( int size) {

        Random random = new Random();
        int[] array = new int[size];
        int length = array.length;

        for (int i = 0; i < length ; i++) {

            array[i] = random.nextInt(21);
        }

        return array;
    }
    public static void ItercambioNumero(int[] array, int numeroASubstituir, int numeroSubstituto ){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <array.length ; i++) {
            int n = array[i];
            if (array[i] == numeroASubstituir){
             stringBuilder.append("\"").append(numeroSubstituto).append("\"");
            }
            else {
                stringBuilder.append(" ").append(n).append(" ");
            }

        }
        System.out.print(stringBuilder);

    }

    public static void EscribeArray(int[] array){

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

}