import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime una nota");
        int notaUno = Integer.parseInt(scanner.next());

        System.out.println("Dime otra nota");
        int notaDos = Integer.parseInt(scanner.next());

        System.out.println("Dime la nota");
        int notaTre = Integer.parseInt(scanner.next());

        double media = (notaUno + notaDos + notaTre) / 3;

        System.out.println(media);

        if (media > 0 || media < 10) {
            if (media < 5) {
                System.out.println("insuficiente");
            }
            else if (media >= 5 && media < 6)
            {
                System.out.println("suficiente");
            }
            else if (media >= 6 && media < 7)
            {
                System.out.println("bien");
            } else if (media >= 7 && media <=8 )
            {
                System.out.println("notable");
            } else if (media >=9 && media < 10 )
            {
                System.out.println("Excelente");
            } else if (media == 10)
            {
                System.out.println("Sobresaiente");
            } else
            {
                System.out.println("error al poner las notas ");
            }

        }
    }
}