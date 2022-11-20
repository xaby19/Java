import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arrayColors = {"verde", "rojo","azul", "amarillo","naranja", "rosa", "negro", "blanco", "morado"};
        String[] colorsWordsArray = new String[8];
        String[] words = CreateArray(colorsWordsArray);
        String[] firsColors = FirstColors(arrayColors,words);
        EscribeArray(firsColors);





    }

    public static String[] CreateArray(String[] aleatoryWordsArray){
        Scanner scanner = new Scanner(System.in);
        int length = aleatoryWordsArray.length;

        String[] words = new String[length];

        for (int a = 0; a < length; a++) {
            System.out.print("Dime uns palabra: ");

            words[a] = scanner.next();




        }
        return words;
    }

    public static String[] FirstColors(String[] arrayColors, String[] words){
       int k = words.length -1;
        int j = 0;
        for ( String i: arrayColors) {
            if (words[j].equals(arrayColors[j])){
                words[j] = i;
                j++;
            }
            else {
                words[k] = i;
                k--;
            }
        }
        return words;
    }

    public static void EscribeArray(String[] firstColor){
        for (String s : firstColor) {
            System.out.print(s + " ");
        }
    }
}