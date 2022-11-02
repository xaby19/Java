import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0, j = 0, k = array.length - 1; i < array.length; i++) {
            int n = random.nextInt(100);
            if (isEven(n)) {
                array[j] = n;
                j++;
            } else {
                array[k] = n;
                k--;
            }
        }

        for (int n : array) {
            System.out.print(n + " ");
        }
    }
    public static boolean isEven (int n) {
        return n % 2 == 0;
    }
}