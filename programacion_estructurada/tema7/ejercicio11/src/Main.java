import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arrayOfNumber = GetArrayOfNumber(10);
        Position(arrayOfNumber);
        EscribeArray(arrayOfNumber);
        int[] firstPrime = FirsPrime(arrayOfNumber);
        Position(firstPrime);
        EscribeArray(firstPrime);
    }
    public static int[]  GetArrayOfNumber(int size){
        Scanner scaner = new Scanner(System.in);
        int[] arraynumber = new int[size];
         int lenthg = arraynumber.length;

        for (int i = 0; i < lenthg ; i++) {
            System.out.print("Dime un numero: ");
            int num = scaner.nextInt();
            arraynumber[i] = num;
        }
        return arraynumber;
    }
    public static int[] FirsPrime(int[] arrayofNumber){
        int lenthg = arrayofNumber.length;
        int aux = 2;
        for (int i = 0; i < lenthg ; i++) {
            for (int j = 1; j < lenthg -i ; j++) {
                if (arrayofNumber[j -1] % aux  == 0 && arrayofNumber[j] % aux  != 0 ){
                    int temp =arrayofNumber[j];
                    arrayofNumber[j] = arrayofNumber[j - 1];
                    arrayofNumber[j -1] = temp;

                }
            }

        }
        return arrayofNumber;
    }
    public static void Position (int [] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(i +" ");
        }
    }
    public static void EscribeArray( int[] array){
        for (int j : array) {

            System.out.print(j + " ");

        }
        System.out.println();

    }
}