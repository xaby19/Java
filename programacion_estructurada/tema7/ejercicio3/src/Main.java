import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int[] arrayOfnumbers = new int[10];

        rellenaArrayReves(arrayOfnumbers);
        EscribeArray(arrayOfnumbers);
    }

    static int[] rellenaArrayReves(int[] arr){//este rellena array rellena empezando por detrás
        Scanner scanner = new Scanner(System.in);
        int length = arr.length;

        for (int i = length - 1; i >= 0 ; i--) {

            System.out.print("Dime un numero: ");
            arr[i] = scanner.nextInt();// así creamos un array de numeros dado por pantalla ya directamente desde atrás


        }
        return arr;
    }

    static void EscribeArray(int [] arr){
        int length = arr.length;
        for (int j = 0; j <length ; j++) {
            System.out.print(arr[j] + " ");// escribimos el array
        }
    }
}