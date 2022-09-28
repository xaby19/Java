import java.util.Scanner;
public class Main { // el ejercicio 10 contiene el 10 y 11 para simplificar
    public static <string> void main(String[] args) {
        Scanner s = new Scanner (System.in);


        System.out.println("dime el valor de Kb");
        double valorKb = Double.parseDouble(s.next());

        System.out.println("Los Mb son " + valorKb * 1000);

        System.out.println("dime el valor de Mb");
        double valorMb= Double.parseDouble(s.next());
        System.out.println("Los Kb son " + valorMb / 1000);
    }
}