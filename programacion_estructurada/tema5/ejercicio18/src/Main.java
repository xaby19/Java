import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un numero");
        int num1 = Integer.parseInt(scanner.next());
        System.out.println("Dime otro numero");
        int num2 = Integer.parseInt(scanner.next());
        int temp= 0;

        if (num1 != num2){//if de seguridad
            if (num1 < num2){// hago que num1 sea siempre el numero mayor
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            for (int i = num2; i <=num1 ; i = i+7) {
                System.out.println(i);
            }

        }
        else {
            System.out.println("Los numeros tienen que ser distintos");
        }
    }
}