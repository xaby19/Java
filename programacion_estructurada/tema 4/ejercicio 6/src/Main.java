import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime la altura");
        int altura = Integer.parseInt(scanner.next());
        double g = 9.89;
        double feaccion= (2*altura)/g;
        double t= Math.sqrt(feaccion);

        System.out.println("el tiempo que tarda el objeto es " + t);
    }
}