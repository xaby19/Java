import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número de 5 cifras como máximo");
        int num = Integer.parseInt(scanner.next());
        int count1=0;
        int count2=0;
        String numCadena = Integer.toString(num);
        for (int i = 0; i < numCadena.length()-1; i++) {
            if (i == i+1 ) {
                count1++;
            }
            for (int j = numCadena.length(); j < 0; j--) {
                if (j == j-1) {
                    count2++;
                }
            }
        }
        if (count1 == count2) {
            System.out.println("Es un numero capicua");
        }else{
            System.out.println("NO es capicua");
        }

    }
}