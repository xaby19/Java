import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberOfWords = 8;
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        String[] words = new String[numberOfWords];

        for (int i = 0; i < numberOfWords; i++) {
            words[i] = scanner.nextLine();
        }

        System.out.println("Array original:");
        printStringArray(words, stringBuilder);

        sortWordsInPlace(words);

        System.out.println("Array resultado");
        printStringArray(words, stringBuilder);
    }
    public static void printStringArray (String[] stringArray, StringBuilder stringBuilder) {
        stringBuilder.setLength(0);

        for (String s : stringArray) {
            stringBuilder.append(s).append(" ");
        }

        System.out.println(stringBuilder.toString());
        stringBuilder.setLength(0);
    }
    public static void sortWordsInPlace (String[] stringArray) {
        /*
           La ordenación de la burbuja funciona de la siguiente forma:
                • Si el array tiene N elementos, se realizarán N-1 pasadas (por ejemplo, para un array de 5 elementos tendremos que realizar 4 pasadas para que quede ordenado).
                • En cada pasada, iremos recorriendo el array de principio a fin comprobando los números por parejas (por ejemplo: el primer y segundo número, el segundo y el tercero, etc.).
                • Si la pareja de números está en orden (o sea, el primero es menor que el segundo) la dejamos como está y si está desordenada, los intercambiamos.

            Ejemplo:
            Si el array original es [3, 9, 4, 6, 8, 1], la pasada sería así:

            [3, 9, 4, 6, 8, 1] -> [3, 4, 9, 6, 8, 1] -> [3, 4, 6, 9, 8, 1] -> [3, 4, 6, 8, 9, 1] -> [3, 4, 6, 8, 1, 9]

            Podéis verificar que el array no se ordena con una sola pasada, pero poco a poco va quedando más ordenado.

            NUESTRAS REGLAS

            Array colores => "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"
                • Si la cadena de texto se corresponde con una del array de colores y la siguiente no = -1.
                • Si la cadena de texto no se corresponde con una del array y la siguiente sí = 1.
                • Si ambas están o no están en el array de colores = 0.
        */
        String[] colors = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado" };
        int length = stringArray.length;
        String temp;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1; j++) {
                int comparison = stringComparator(stringArray[j], stringArray[j + 1], colors);

                // Si la cadena de texto no se corresponde con una del array y la siguiente sí le damos la vuelta.
                if (comparison == 1) {
                    temp = stringArray[j + 1];
                    stringArray[j + 1] = stringArray[j];
                    stringArray[j] = temp;
                }
            }
        }

    }
    public static int stringComparator (String s1, String s2, String[] importantWords) {
        if (stringArrayIncludes(s1, importantWords)) {
            if (stringArrayIncludes(s2, importantWords)) {
                return 0;
            } else {
                return -1;
            }
        }
        else {
            if (stringArrayIncludes(s2, importantWords)) {
                return 1;
            } else {
                return 0;
            }
        }
    }
    public static boolean stringArrayIncludes (String s, String[] stringArray) {
        int length = stringArray.length;

        for (String value : stringArray) {
            if (s.equals(value)) {
                return true;
            }
        }

        return false;
    }
}