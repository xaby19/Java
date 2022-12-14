import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // se definen constantes para representar el
        // contenido de las celdas
        final int VACIO = 0;
        final int MINA = 1;
        final int TESORO = 2;
        final int INTENTO = 3;

        int x;
        int y;
        int[][] cuadrante = new int[5][4];
        // inicializa el array
        for (x = 0; x < 4; x++) {
            for (y = 0; y < 3; y++) {
                cuadrante[x][y] = VACIO;
            }
        }
        // coloca la mina
        int minaX = (int) (Math.random() * 4);
        int minaY = (int) (Math.random() * 3);
        cuadrante[minaX][minaY] = MINA;
        // coloca el tesoro
        int tesoroX;
        int tesoroY;
        do {
            tesoroX = (int) (Math.random() * 4);
            tesoroY = (int) (Math.random() * 3);
        } while ((minaX == tesoroX) && (minaY == tesoroY));
        cuadrante[tesoroX][tesoroY] = TESORO;
        // juego
        System.out.println("¡BUSCA EL TESORO!");
        boolean salir = false;
        String c = "";
        do {
            // pinta el cuadrante
            for (y = 3; y >= 0; y--) {
                System.out.print(y + "|");
                for (x = 0; x < 5; x++) {
                    if (cuadrante[x][y] == INTENTO)
                        System.out.print("X ");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println(" ----------\n0 1 2 3 4\n");
            // pide las coordenadas
            System.out.print("Coordenada x: ");
            x = scanner.nextInt();
            System.out.print("Coordenada y: ");
            y = scanner.nextInt();
            // mira lo que hay en las coordenadas indicadas por el usuario
            switch (cuadrante[x][y]) {
                case VACIO:
                    cuadrante[x][y] = INTENTO;
                    if ((Math.abs(x - minaX) < 2) && (Math.abs(y - minaY) < 2)) {
                        System.out.println("Cuidado, hay una mina cerca.");
                    }
                    break;
                case MINA:
                    System.out.println("Lo siento, has perdido.");
                    salir = true;
                    break;
                case TESORO:
                    System.out.println("Enhorabuena, has encontrado el tesoro.");
                    salir = true;
                    break;
                default:
            }
        }
        while (!salir);
        // pinta el cuadrante

        for (y = 3; y >= 0; y--) {
            System.out.print(y + " ");
            for (x = 0; x < 5; x++) {
                switch (cuadrante[x][y]) {
                    case VACIO:
                        c = " ";
                        break;
                    case MINA:
                        c = "* ";
                        break;
                    case TESORO:
                        c = "€ ";
                        break;
                    case INTENTO:
                        c = "x ";
                        break;
                    default:
                }
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println(" ----------\n 0 1 2 3 4\n");

    }
}