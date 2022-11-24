
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arrayNuevo = new int[10];
        EscribeArray(getArrayNuevo(arrayNuevo));
        System.out.println();
        int numArray= MaxOMin(arrayNuevo);
        System.out.print(numArray+ " position");
        EscribeYResaltaArray(arrayNuevo, numArray);
    }

    private static int[] getArrayNuevo(int[] arrayNuevo) {
        Random random = new Random();
        int length = arrayNuevo.length;
        for (int i = 0; i < length; i++) {
            arrayNuevo[i] = random.nextInt(501);
        }
        return arrayNuevo;
    }

    public static int MaxOMin(int[] array) {
        Scanner scaner = new Scanner(System.in);
        System.out.print("¿Que quieres destacar el max o el min? ");
        String respuesta = scaner.next();
        int max = 0;
        int postMax = 0;
        int min= array.length-1;
        int postMin= 10;

        int result = 0;

        if (respuesta.equals("min")) {
            for (int i = array.length-1; i >= 0; i--) {
                if (array[i] < min) {
                    min = array[i];
                    postMin = i;
                }
            }
            result = postMin;


        } else if (respuesta.equals("max")){
            for (int i = 0; i < array.length;  i++) {
                if (array[i] > max) {
                    max = array[i];
                    postMax = i;
                }
            }
            result = postMax;
        }
        return result;
    }


    private static void EscribeArray (int[] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
    public static void EscribeYResaltaArray(int[] array, int numArray){
        for (int k = 0; k < array.length; k++) {
            if (k == numArray){
                System.out.print("**" + array[k] + "**");
            }
            else {
                System.out.print(array[k] + " ");
            }
        }
    }
}