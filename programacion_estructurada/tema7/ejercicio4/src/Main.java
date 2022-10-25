import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numerosArray = new int[20];
       rellenaArrays(numerosArray);
       EscribeArray(numerosArray);

        int [] cuadradoArray = new int[20];
        Arraycuadrado(cuadradoArray);
        EscribeArray(cuadradoArray);

        int [] cuboArray= new int[20];
        Arraycubo(cuboArray);
        EscribeArray(cuboArray);
    }
    static int[] rellenaArrays(int[] arr){//este rellena array rellena empezando por detrás

        int length = arr.length;

        for (int i = 0; i < length ; i++) {


            arr[i] = (int)(Math.random() * 100 + 1);


        }
        return arr;
    }
    static int[] Arraycuadrado(int[] rellenaArrays){
        int [] cuadradoArray = new int[20];

        int length = rellenaArrays.length;
        for (int i = 0; i < length ; i++) {
            cuadradoArray[i] = (rellenaArrays[i] * rellenaArrays[i]);
        }
        return cuadradoArray;
    }
    static int[] Arraycubo(int[] rellenaArrays){
        int [] cuboArray= new int[20];
        int length = rellenaArrays.length;
        for (int i = 0; i < length ; i++) {
            cuboArray[i] = (rellenaArrays[i] *rellenaArrays[i] * rellenaArrays[i]);
        }
        return cuboArray;
    }

    static void EscribeArray(int [] arr){
        int length = arr.length;
        for (int j = 0; j <length ; j++) {
            System.out.println(arr[j] + " ");// escribimos el array
        }
    }

}