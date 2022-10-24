public class Main {
    public static void main(String[] args) {
        int max= 100;
        for (int i = 2; i <= max ; i++) {

           if (!(i==2 || i == 4)){
               if (Primo(i) <= 2) {
                   System.out.print(i + " ");
               }

           }
           else if (i == 2){
               System.out.print(i + " ");
           }
        }
        System.out.print(max);
    }
    static int Primo(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                count++;

            }
        }
        return count;
    }
}