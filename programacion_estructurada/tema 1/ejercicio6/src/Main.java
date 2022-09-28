public class Main {
    public static void main(String[] args) {
        System.out.println();
        int numFilas = 9;
        for (int altura = 1; altura <=numFilas ; altura++) {
            for (int i = 0; i <= numFilas - altura ; i++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (altura * 2 ) - 1 ; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}