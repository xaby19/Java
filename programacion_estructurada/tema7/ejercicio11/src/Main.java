import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arrayOfNumber = getArrayOfNumber(10);
        int[] arrayposition = ArrayPosition(arrayOfNumber);
        int[] arrayPrimeNum = getArrayPrimeNum(arrayOfNumber, CountPrime(arrayOfNumber));
        EscribeArray(arrayposition);
        EscribeArray(arrayOfNumber);
        System.out.println();
        EscribeArray(arrayposition);
        EscribeArray(arrayPrimeNum);
    }

    public static int[] getArrayPrimeNum(int[] arrayOfNumber, int CountPrime) {
        int[] arrayPrimerNum = new int[arrayOfNumber.length];
        for (int i = 0, j = 2, k = arrayOfNumber.length - 1; i <= arrayOfNumber.length ; i++) {

            if (!(i==2 || i == 4)){
                if (CountPrime(i) <= 2) {
                   arrayPrimerNum[i] = arrayOfNumber[i];
                   j++;
                }

            }
            else if (i == 2){
                arrayPrimerNum[k] = arrayOfNumber[i];
                k--;
            }
        }

        return arrayPrimerNum;

    }

    public static int CountPrime(int[] arrayOfNum){
        int num = 0;
        int count = 0;
        for (int i = 2, j = 0; i <= num; i++) {
            num = arrayOfNum[j];
            if (num % i == 0) {
                count++;
                j++;

            }
        }
        return count;
    }

    public static int[] getArrayOfNumber(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        int length = array.length;

        for (int i = 0; i < length ; i++) {
            System.out.print("Dime un numero: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static int[] ArrayPosition(int[] array){
        int [] position = new int [array.length];
        for (int i = 0; i < array.length ; i++) {
           position[i] = i;
        }
        return position;
    }
    public static void EscribeArray( int[] array){
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

        }
        System.out.println();

    }

}