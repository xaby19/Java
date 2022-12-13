import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String miString = getMiSting();
        int espacios = CuentaEspacios(miString);
        System.out.println(espacios);

    }
    static String getMiSting() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Dime una frase");
        String MiString = scaner.nextLine();

        return MiString;

    }
    static int CuentaEspacios(String miString){
        int contadorEspacios = 0;
        for (int i = 0; i <miString.length() ; i++) {
            if (miString.charAt(i) == ' '){
                contadorEspacios++;
            }
        }
        return contadorEspacios;
    }
}