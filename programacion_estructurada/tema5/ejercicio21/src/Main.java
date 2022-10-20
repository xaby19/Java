import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int i = 0;
        int imp = 0;
        int countImp = 0;
        int maxPar = 0;

        while(numero >= 0){
            System.out.println("Dime un número: ");
            numero = Integer.parseInt((scanner.next()));
            if (i % 2 != 0){
                imp += numero;
                countImp++;
            }
            else{
                if (maxPar < numero){

                    maxPar = numero;
                }
            }
            i++;
        }
        double mediaImp = imp/countImp ;
        System.out.println("la media de los impares es " + mediaImp);
        System.out.println("El numero mayor de pares es " + maxPar);
    }
}