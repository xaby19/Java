import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arrayOFNumbers = getArrayOFNumbers(8);

        EvenOrOdd(arrayOFNumbers);
    }

    private static int[] getArrayOFNumbers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        int length = array.length;

        for (int i = 0; i < length ; i++) {
            System.out.print("Dime un numero: ");
            array[i] = scanner.nextInt();
        }

        return  array;
    }

    private static void EvenOrOdd (int[] array){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length ; i++) {

            if(array[i] % 2 == 0){
                stringBuilder.append(array[i]).append(" par ");
            }
            else {
                stringBuilder.append(array[i]).append(" impar ");
            }
        }
        System.out.print(stringBuilder);
    }


}