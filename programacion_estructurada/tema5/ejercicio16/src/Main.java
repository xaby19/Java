import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Dime un numero y te dire si es primo o no");
        int num = Integer.parseInt(scanner.next());

        if (!(num == 0 || num == 2 || num== 4)){

            if (Primo(num) <= 2){
                System.out.println("El numero es primo");
            }
            else {
                System.out.println("El numero no es primo");
            }
        }
        else {
            System.out.println("El numero no es primo");
        }


    }
    static int Primo(int num){
        int count= 0;
        for (int i = 2; i <= num ; i++) {
            if (num % i == 0){
                count++;

            }
        }
        return count;
    }
}