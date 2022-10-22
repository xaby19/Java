import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int digits = getNumberOfDigits(n);
        int[] digitsArray = new int[digits];

        if (n != 0){
            int current = Math.abs(n);
            int count = 0;

            while (current > 0) {
                digitsArray[count] = current % 10;
                count++;
                current /= 10;
            }
        } else {
            digitsArray[0] = 0;
        }

        for (int j : digitsArray) {
            System.out.print(j);
        }
    }
    public static int getNumberOfDigits (int n) {
        if (n != 0){
            int count = 0;
            int current = Math.abs(n);

            while (current > 0) {
                current = current / 10;
                count++;
            }

            return count;
        } else {
            return 1;
        }
    }
}