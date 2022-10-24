import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int numero = scanner.nextInt();
        System.out.print("Dime el numero del cual se descartara sus divisores: ");
        int divisor = scanner.nextInt();

       if (numero > 0){
           for (int i = 1; i <= numero ; i++) {

               if (i % divisor != 0){
                   System.out.print(i + " 20");
               }

           }
       }
       else {
           System.out.println("el numero debe ser positivo");
       }
    }
}