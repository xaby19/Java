import java.util.Random;

public class Main {
    public static void main(String[] args) {
       int[] getArray = GetArrayRandom(20);
       WritenArray(getArray);
        System.out.println();
       int[] firstEvent = EventFirst(getArray);
       WritenArray(firstEvent);
    }
    public static int[] GetArrayRandom(int size){
        Random random = new Random();
        int[] result = new int[size];

        for (int i = 0; i < result.length ; i++) {
            int n = random.nextInt(100) +1;
            result[i] = n;
        }
        return result;
    }
    public static int[] EventFirst(int[] getArray){
        int length = getArray.length;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < (length -i) ; j++) {
                if (getArray[j] % 2 == 0 && getArray[j - 1] % 2 != 0 ){
                    int temp = getArray[j -1];
                    getArray[j -1] = getArray[j];
                    getArray[j] = temp;
                }
            }
        }
        return getArray;
    }
    public  static void WritenArray(int[] getArray){
        for (int i = 0; i < getArray.length ; i++) {
            System.out.print(getArray[i] + " ");

        }
    }



}