import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("dime el valor de a");
        int a = Integer.parseInt(scanner.next());

        System.out.println("dime el valor de b");
        int b = Integer.parseInt(scanner.next());

        double x= 1;
        /*
        ax + b = 0
         */
        if (a==0){
            System.out.println("No tiene solucion ya que X vale 0");
        }
        else{
            System.out.println("x = 0" + (-b/a));
        }
    }
}