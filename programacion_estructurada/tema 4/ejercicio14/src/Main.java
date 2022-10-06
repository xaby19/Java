
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("dime un numero");
        Scanner scanner = new Scanner(System.in);
        int num= Integer.parseInt(scanner.next());

        if (num % 2 == 0)
        {
            System.out.println("el numero introducido es par ");
        }
        else {
            System.out.println("el numero introducido no es para");
        }
        if (num % 5 == 0){
            System.out.println("el numero es divisible entre 5");
        }
        else {
            System.out.println("El numero no es dividible entre 5");
        }
    }

}