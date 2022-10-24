import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("dime un numero");
        int numero = Integer.parseInt(scaner.next());
        int suma = 0;
        int count = 0;
        for (int i = 1; i <= numero ; i++) {
         if (i % 3 == 0){
             System.out.print(i + " ");
             suma += i;
             count++;
         }
        }
        System.out.printf("La cantidad de numeros divisibles entre 3 entre 1 y  %S, es %S. Y la suma de estos es %S.,", numero, count,suma);
    }
}