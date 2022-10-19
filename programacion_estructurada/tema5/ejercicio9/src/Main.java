import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero y te dire cuantas cifras tiene");
        int numero = Integer.parseInt(scanner.next());
        int count = 0;

       if (numero == 0){
           System.out.println("EL numero tiene una sola cifra");
       }
       else {
           while(numero !=0)
           {
               numero /=10;
               count++;
           }
           System.out.println("El numero tiene " + count + " cifras");
       }

    }
}