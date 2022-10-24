import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int numero = scanner.nextInt();
        int suma = 0;
        for (int i = 0; i <= numero ; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
                suma+=i;
            }
        }
        System.out.println("la suma es " + suma);
    }
}