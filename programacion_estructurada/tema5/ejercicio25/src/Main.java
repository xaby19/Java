import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un numero");
        int numero = Integer.parseInt(scanner.next());
        int[] numeroArray= new int[numeroIntroducido(numero)];
    }
    static int[] numeroAlreves(int[] numeroArray, int numero){
        int [] numeroAlreves = new int[numeroIntroducido(numero)];


        for (int i = 0; i < numeroArray.length-1 ; i++) {

        }
        return numeroAlreves;
    }
    static int numeroIntroducido(int numero){
                int count = 0;

                if (numero == 0){
                    count   = 1;
                }
                else {
                    while (numero != 0) {
                        numero /= 10;
                        count++;
                    }

                }

            return count;
    }
}