
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdice la altura de la pirámide: ");
        int alturaIntroducida = Integer.parseInt(scanner.next());

        System.out.print("Introduce el carácter: ");
        String relleno = scanner.next();

        int altura = 1;
        int i;
        int espaciosDelanteros = alturaIntroducida - 1;
        int espaciosDentro = 0;

        
        while (altura < alturaIntroducida) {

            for (i = 1; i <= espaciosDelanteros; i++) {
                System.out.print(" ");
            }

            System.out.print(relleno);
            for (i = 1; i < espaciosDentro; i++) {
                System.out.print(" ");
            }

            if (altura>1) {
                System.out.print(relleno);
            }

            System.out.println();
            altura++;
            espaciosDelanteros--;
            espaciosDentro += 2;
        }


        for (i = 1; i < altura*2; i++) {
            System.out.print(relleno);
        }
    }
}