import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         int []creaArray = new int[10];

        Scanner scanner= new Scanner(System.in);
        System.out.print("Dime un numero del 0-9: ");
        int inicial = scanner.nextInt();
        System.out.print("Dime un numero del 0-9: ");
        int end = scanner.nextInt();
        int temp = 0;
        if (end < inicial){
            inicial = temp;
            temp = end;
            end = temp;
        }
        if(!(inicial < 0 && inicial > 10) || !(end < 0 && end > 10)){

        EscribeArray;
        System.out.println();
        int[] rotaArray = getRotaArray(creaArray, inicial,end);
        EscribeArray(rotaArray);
        }
    public static int[] GetArray(int [] array;) {
        int length = array.length;

        for (int i = 0; i < length ; i++) {
            System.out.print("Dime un numero: ");
            array[i] = scanner.nextInt();
        }

        return array;
    }




}

    public static int[] getRotaArray( int[] array, int  inicial, int end ) {

            int length = array.length;
            int valorDeCero = array[length - 1];//variable aux. para mantener el valor.

            for (int j = length - 1; j >= 1; j--) {

                array[j] = array[j - 1];

            }
            array[0] = valorDeCero;


        return array;
    }

    static void EscribeArray(int[] array){

        for (int j : array) {

            System.out.print(j + " ");
        }
    }
}