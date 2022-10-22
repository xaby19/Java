import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int digits = getNumberOfDigits(n);
        int position = (int) Math.pow(10, digits);// hace que las posiciones sean en base 10
        int result = 0;

        while (digits > 0) {
            int digit = n % 10;
            n /= 10;
            position /= 10;
            digits--;
            result += (digit * position);
        }

        System.out.println(result);
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