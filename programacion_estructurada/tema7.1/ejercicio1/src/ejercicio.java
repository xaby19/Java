 public class ejercicio {
public static void main(String[] args)
        throws InterruptedException { // Se añade esta línea para poder usar sleep
    int rows = 3;
    int columns = 6;
    int[][] num ={
            {
                0,30,2,0,0,5
            },
            {
                75,0,0,0,0,0
            },
            {
                0,0,-2,9,0,11
            }
    };



    System.out.print("       ");
        for (int i = 0; i <columns; i++) {
            System.out.print("   Columna " + i);
        }

        //empieza el bucle para recorrer el array

        for (int i= 0; i < rows; i++) {

            System.out.print("\nFila " + rows);

            for (int j = 0; j < columns ; j++) {
                System.out.printf("%9d   ", num[i][j]);
                Thread.sleep(500); // retardo de medio segundo
            }
        }
    }
}