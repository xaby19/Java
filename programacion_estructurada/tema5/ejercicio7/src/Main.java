import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cifra de cuatro numeros para abrir la caja fuerte. Tienes 4 intentos");
        int cifra = Integer.parseInt(scanner.next());
        int cifraCorrecta = 1454;

        if ( cifra > 0 && cifra < 9999){
            for (int i = 1; i < 4 ; i++) {
                if (cifra == cifraCorrecta){
                    System.out.println("Enhorabuena!!! Has abierto la caja fuerte");
                    i = 4;
                }
                else {
                    System.out.println("lo sentimos intentalo de nuevo");
                    System.out.println("Introduce una cifra de cuatro numeros para abrir la caja fuerte. Tienes 4 intentos");
                    cifra = Integer.parseInt(scanner.next());
                }
            }
        }
        else {
            System.out.println("error al introducir la cifra");
        }
    }
}