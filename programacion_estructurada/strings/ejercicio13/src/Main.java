import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una frase con acento y se los quito");
        String s = scanner.nextLine();
        System.out.println(QuitaAcentos(s));
    }
    public static String QuitaAcentos(String s){
        String acentos = "áéíóúàèìòùâêîôûäëïöüÁÉÍÓÚÀÈÌÒÙÂÊÎÔÛÄËÏÖÜ", sinAcentos = "aeiouaeiouaeiouaeiouAEIOUAEIOUAEIOUAEIOU", result = s;
        int position = -1;

        for (int i = 0; i < result.length(); i++)
        {
            position = acentos.indexOf(result.charAt(i));

            if ( position != -1)
            {
                result = result.replace(result.charAt(i), sinAcentos.charAt(position));
            }
        }

        return result;
    }
}