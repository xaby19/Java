public class Main {
    public static void main(String[] args) {
        System.out.println();
        int numFilas = 9;// lo defino con nueve ya que no uso el scanner y nos pide que sea de 9 "*"s

        for (int numBlancos = 0, numAsteriscos =(numFilas*2) - 1; numAsteriscos > 0 ; numBlancos++, numAsteriscos -= 2){

            for (int i = 0; i < numBlancos ; i++) {
                System.out.print(" ");
            }
            for (int j = numAsteriscos; j>0; j--){

                System.out.print("*");
            }

            System.out.println();
        }
    }
}