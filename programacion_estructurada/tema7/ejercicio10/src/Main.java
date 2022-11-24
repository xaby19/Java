import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arrayRandomInt = getArrayRandomInt(20);
       ArrayEventFerst(ArrayEvent(arrayRandomInt, CountEvent(arrayRandomInt),(ArrayOdd(arrayRandomInt,CountOdd(arrayRandomInt));
    }

    public static int[] getArrayRandomInt(int size) {
        int[] arrayRandom = new int[size];
        int length = arrayRandom.length;
        Random random= new Random();

        for (int i = 0; i < length ; i++) {
            arrayRandom[i] = random.nextInt(101);
        }
        return arrayRandom;
    }

    public static int CountEvent(int[] arrayRandom){
        int countEvent = 0;
        for (int i = 0; i < arrayRandom.length -1 ; i++) {
            if (arrayRandom[i] % 2 == 0) {
                countEvent++;
            }
        }

        return countEvent;
    }
    public static int CountOdd(int[] arrayRandom){
        int countOdd = 0;

        for (int i = 0; i < arrayRandom.length -1 ; i++) {
            if (arrayRandom[i] % 2 != 0) {
                countOdd++;
            }
        }

        return countOdd;
    }

    public static int[] ArrayEvent(int[] arrayRandom, int CountEvent){

        int[] arrayEvent = new int[CountEvent];


        for (int i = 0; i < arrayEvent.length ; i++) {

            if (arrayRandom[i] % 2 == 0) {
                arrayEvent[i] = arrayRandom[i];
            }

        }
        return arrayEvent;
    }

    public static int[] ArrayOdd(int[] arrayRandom, int CountOdd){

        int[] arrayOdd = new int[CountOdd];


        for (int i = 0; i < arrayOdd.length ; i++) {

            if (arrayRandom[i] % 2 == 0) {
                arrayOdd[i] = arrayRandom[i];
            }

        }
        return arrayOdd;
    }
    public static void ArrayEventFerst(int[]ArrayEvent, int[] ArrayOdd){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ArrayEvent).append(ArrayOdd);
        System.out.println(stringBuilder);
    }

}