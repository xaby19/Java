import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        int num = 0;

        int i = 0;

        int d = 0;

        while(num >= 0){
            System.out.println("Dime un número: ");
            num = Integer.parseInt((s.next()));
            d = d+num;
            i++;
        }
        double media= (d-num) / (i-1);
        System.out.println("La media sale: "+ media);
    }
}