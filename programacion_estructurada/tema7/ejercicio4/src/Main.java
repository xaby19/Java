import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] array = creaArrayIntRandom(20);
        int [] cuadradoArray = Arraycuadrado(array);
        int [] cuboArray= Arraycubo(array);

        System.out.println("n\t\t\t n^2\t\t\t\t n^3\t\t\t\t\t\t");

        for (int i = 0; i < array.length ; i++) {
            System.out.printf("%s\t\t\t %s\t\t\t\t %s\t\t\t\t\t\t \n", array[i], cuadradoArray[i], cuboArray[i]);
        }

    }
    static int[] creaArrayIntRandom(int size){//este rellena array rellena empezando por detrás
        int[] array = new int[size];
        int length = array.length;
        Random random = new Random();
        for (int i = 0; i < length ; i++) {

            int n = random.nextInt(101);
            array[i] = n;


        }
        return array;
    }
    static int[] Arraycuadrado(int[] array){
        int [] result = new int[array.length];

        int length = array.length;
        for (int i = 0; i < length ; i++) {

            int n = array[i];
            result[i] = ((int) Math.pow(n,2));
        }
        return result;
    }
    static int[] Arraycubo(int[] array){
        int [] result = new int[array.length];

        int length = array.length;
        for (int i = 0; i < length ; i++) {

            int n = array[i];
            result[i] = ((int) Math.pow(n,3));
        }
        return result;
    }

    static void EscribeArray(int [] arr){
        int length = arr.length;
        for (int j = 0; j <length ; j++) {
            System.out.println(arr[j] + " ");// escribimos el array
        }
    }

}