import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cual es la base imponible: ");
        double basePrecio = Double.parseDouble(scanner.next());

        System.out.print("Indique el tipo de promoción:Pulse  \n1 para nopro\n2 para mitad\n3 para meno5\n4 para 5porc\n");
        int codigoDeDescuento = Integer.parseInt(scanner.next());

        switch (codigoDeDescuento){
            case 1:
                break;
            case 2:
                basePrecio/=2;
                break;
            case 3:
                basePrecio-=5;
                break;
            case 4:
                basePrecio*=0.05;
                break;
            default:
                System.out.println("No existe esta opción");
                break;


        }
        System.out.println("escribe el IVA que desas aplicar, debe ser un 21 o 10 o 4 %");
        double iva = Double.parseDouble(scanner.next());

        if (iva == 21 || iva == 10 || iva ==4) {
            if (iva == 21) {
                System.out.println("Resultado: " + basePrecio * 1.21);
            } else if (iva == 10) {
                System.out.println("Resultado: " + basePrecio * 1.10);
            } else {
                System.out.println("Resultado: " + basePrecio * 1.04);
            }
        }
        else {
            System.out.println("El IVA no es correcto.");
        }
    }
}