public class Main {
    public static void main(String[] args) {
       String programacionRojo = "\033[31m" + "Programacion\t";
       String marcasVerde = "\033[32m" + "Marcas\t";
       String sistemasNaranja = "\033[33m" + "Sistemas\t";
       String entornoAzul = "\033[34m" +"Entornos\t";
       String bbddMorado = "\033[35m" + "BBDD\t";
       String inglesBlanco = "\033[37m" + "Ingles\t";

        System.out.print("Luenes;\t\t");
        System.out.println(bbddMorado + bbddMorado + inglesBlanco +"------------ ");
        System.out.print("Martes:\t\t");
        System.out.println( entornoAzul + entornoAzul+ programacionRojo+ programacionRojo + marcasVerde + marcasVerde);
        System.out.print("Miercoles:\t");
        System.out.println(programacionRojo + programacionRojo+ programacionRojo + inglesBlanco  + sistemasNaranja + sistemasNaranja);
        System.out.print("Jueves:\t\t");
        System.out.println(entornoAzul + programacionRojo + programacionRojo + programacionRojo + sistemasNaranja + sistemasNaranja);
        System.out.print("Viernes:\t");
        System.out.println(bbddMorado + bbddMorado +  sistemasNaranja + sistemasNaranja + marcasVerde + marcasVerde);
   }
}