import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner secanner = new Scanner(System.in);
        System.out.println("Dime una hora del dia de 0 a 23");
         int horaDia = Integer.parseInt(secanner.next());

         if (horaDia < 24)
         {
          if (horaDia >= 6 && horaDia <= 12)
         {
                 System.out.println("Buenos días");
         }
         else if (horaDia >= 13 && horaDia <= 20 )
         {
             System.out.println("Buenas Tardes");
         }
         else if (horaDia >= 21 && horaDia <= 23) {
             System.out.println("Buenas noches");
         }
         else if (horaDia >= 0 && horaDia<=5)
         {
             System.out.println("A dormir!!!!!");
         }
         }
         else {
             System.out.println("error al introducir la hora");
         }
    }
}