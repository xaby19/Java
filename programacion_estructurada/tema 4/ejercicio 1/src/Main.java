import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dime un dia de la semana lectivo en numero ");
        Integer diaLectivo = Integer.parseInt(scanner.next());

        switch (diaLectivo){
            case 1:
                System.out.println("Base de Datos");
            break;
            case 2:
                System.out.println("Entorno");
            break;
            case 3:
                System.out.println("Programacion");
            break;
            case 4:
                System.out.println("Entorno");
            break;
            case 5:
                System.out.println("Base de Datos");
            break;
            default:
                System.out.println("error al introducir el dia");
            break;
        }

    }

}