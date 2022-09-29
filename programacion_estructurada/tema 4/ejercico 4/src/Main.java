import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("dime las horas trabajadas en la semana");
       int  horasSemana = Integer.parseInt(scanner.next());
       int horasOrdinarias= 40;
       int Euros = 12;
       int euroExtras= 16;
       int salario = 0;
        if (horasSemana<= 40){
            salario = horasSemana * Euros;
        }
        else if (horasSemana > 40){
            int salarioExtra;
            salarioExtra = (horasSemana - horasOrdinarias) * euroExtras ;
            salario = (horasSemana * Euros) + salarioExtra;
       }
        System.out.println(salario);
    }
}