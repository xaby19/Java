import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnner = new Scanner (System.in);

        int countPositivo = 0;
        int countNegativo = 0;

        for (int i = 0; i <10 ; i++) {
            System.out.println("Dime un numero");
            int num = Integer.parseInt(scnner.next());

            if (num > 0){
                countPositivo++;
            }
            else {
                countNegativo++;
            }
        }
        System.out.println("El numero de positivos es = "+ countPositivo);
        System.out.println("El numero de negativos es = "+ countNegativo);

    }
}