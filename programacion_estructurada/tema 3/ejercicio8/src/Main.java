import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.println("Dime las horas trabajadas en esta semana");
        double horasTrabajadas = Double.parseDouble(s.next());
        int salario = 12;
        double result = horasTrabajadas * salario;
        System.out.println("Este es tu salario semanal" + result);
    }
}