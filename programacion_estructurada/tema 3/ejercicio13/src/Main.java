import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime la notra del primer examen");
        double primerExamen = Double.parseDouble(scanner.next());
        primerExamen *= 1.40;

        System.out.println("que media quieres tener en el primer trimestre");
        double notaPrimerTrimestre = Double.parseDouble(scanner.next());

        double segundoExamen = (primerExamen - notaPrimerTrimestre) * 1.60;
        System.out.println("La nota del segundo examen es  " + segundoExamen);
    }
}