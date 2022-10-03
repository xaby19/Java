import java.util.Scanner;
public class ejercicio10 {
    public static void main (String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca día y mes de nacimiento en formato mes,dia ej; 2,19: ");
        double x = scanner.nextDouble();

        if (x >= 3.21 && x <= 4.19){
            System.out.println("Aries");
        }
        if (x >= 4.20 && x <= 5.20){
            System.out.println("Tauro");
        }
        if (x >= 5.21 && x <= 6.20){
            System.out.println("Geminis");
        }
        if (x >= 6.21 && x <=7.22){
            System.out.println("Cancer");
        }
        if (x >= 7.23 && x <=8.22){
            System.out.println("Leo");
        }
        if (x >= 8.23 && x <=9.22){
            System.out.println("Virgo");
        }
        if (x >= 9.23 && x <=10.22){
            System.out.println("Libra");
        }
        if (x >= 10.23 && x <=11.21){
            System.out.println("Escorpio");
        }
        if (x >= 11.22 && x <=12.21){
            System.out.println("Sagitario");
        }
        if (x >= 12.22 && x <=1.19){
            System.out.println("Capricornio");
        }
        if (x >= 1.20 && x <=2.19){
            System.out.println("Acuario");
        }
        if (x >= 2.20 && x <=3.20){
            System.out.println("Cancer");
        }
    }
}