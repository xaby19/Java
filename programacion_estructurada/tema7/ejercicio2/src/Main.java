public class Main {
    public static void main(String[] args) {
        char[] simbolo = new char[10];
        simbolo[0] = 'a';
        simbolo[1] = 'x';


        simbolo[4] = '@';

        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';

        int length = simbolo.length;
        for (int i = 0; i < length -1 ; i++) {
            System.out.print(simbolo[i] + " ");
        }
    }
}