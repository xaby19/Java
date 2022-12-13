import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();

            if (isPalindrome(input)) {
                System.out.printf("\"%s\" es un palíndromo", input);
            } else {
                System.out.printf("\"%s\" NO es un palíndromo", input);
            }
        }

        public static boolean isPalindrome (String s) {
            String withoutWhitespaces = removeNonLetter(s);
            String reversed = reverseString(withoutWhitespaces);

            return withoutWhitespaces.equalsIgnoreCase(reversed);
        }
        public static String reverseString(String s) {
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = s.length() - 1; i >= 0 ; i--) {
                char c = s.charAt(i);
                stringBuilder.append(c);
            }

            return stringBuilder.toString();
        }
        public static String removeNonLetter(String s) {
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLetter(c)) {
                    stringBuilder.append(c);
                }
            }

            return stringBuilder.toString();
        }
    }


