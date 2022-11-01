import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] leeArray = getLeeArray(100);
        EscribeArray(leeArray);

        System.out.println("Dime el numero que quieres sulbstituir (0-20");
        int numeroASubstituir = scanner.nextInt();
        System.out.println("Dime el numero que sustituira al primer numero (0-20)");
        int numeroSubstituto = scanner.nextInt();
        String intercambio= ItercambioNumero(leeArray, numeroASubstituir, numeroSubstituto);
        LeeString(intercambio);
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
    public static String ItercambioNumero(int[] array, int numeroASubstituir, int numeroSubstituto ){
        String result = null;
        for (int i = 0; i <array.length ; i++) {

            if (array[i] == numeroASubstituir){
                array[i]= numeroSubstituto;

                result = "\"" + array + "\"";
            }

        }

        return  result;
    }

    public static void EscribeArray(int[] array){

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }
    public static void LeeString(String intercambio){

        for (int i = 0; i <intercambio.length() ; i++) {

            System.out.print(intercambio[i] + " ");
        }
    }

}