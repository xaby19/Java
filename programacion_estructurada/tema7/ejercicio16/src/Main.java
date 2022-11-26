import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbersRandomArray = GetNumbersRandomArray(20);
        WrittenArray(numbersRandomArray);
        System.out.println();
        int[] result = PositionArray(numbersRandomArray);
        WritenArrayAndEnphasis(result, numbersRandomArray);
    }
    public static int[] GetNumbersRandomArray(int size){

        Random random = new Random();
        int [] numbersRandomArray = new int[size];
        int length = numbersRandomArray.length;
        for (int i = 0; i < length ; i++) {
            int num = random.nextInt(401);
            numbersRandomArray[i] =  num;
        }

        return numbersRandomArray;
    }
    public static void WrittenArray(int[] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static int[] PositionArray(int[] numbersRandomArray){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime si quieres marcar los multiplos5 o multiplos7: ");
        String respuesta = scanner.next();
        int[] result = new int[numbersRandomArray.length];
        for (int i = 0; i < numbersRandomArray.length ; i++) {
            if (respuesta.equals("multiplos5")) {
                if (numbersRandomArray[i] % 5 == 0) {
                    result[i] = numbersRandomArray[i];
                }
            }
            if (respuesta.equals("multiplos7")){
                if (numbersRandomArray[i] % 7 == 0){
                    result[i] = numbersRandomArray[i];
                }
            }
        }
        return result ;
    }


    public static void WritenArrayAndEnphasis(int[] result, int[] numbersRandomArray ){
        for (int i = 0; i < numbersRandomArray.length ; i++) {
            if (result[i] == numbersRandomArray[i]){
                System.out.print("[" + numbersRandomArray[i] + "]");
            }
            else {
                System.out.print(numbersRandomArray[i] + " ");
            }
        }
    }
}
