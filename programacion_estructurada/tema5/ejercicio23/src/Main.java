
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        int suma;
        int countNum = 0;
        int numero;

        for (suma = 0; suma <= 10000 ; suma+= numero) {
            System.out.println("Introduce numero hasta sobre pasar 10000");
            numero = Integer.parseInt(scanner.next());
            countNum++;
        }
        double media;
        media = (double)suma / (double)countNum;

        System.out.println("El total acumulado es " + suma + " se han introducido "
        + countNum+ " numeros y su Media es "+ media );
    }
}