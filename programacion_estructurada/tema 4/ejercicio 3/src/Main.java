import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("dime un dia de la semana en numero: ");
        int diaSemana = Integer.parseInt(scanner.next());

      if (diaSemana < 1 && diaSemana > 8){
          switch (diaSemana){
              case 1:
                  System.out.println("Lunes");
                  break;
              case 2:
                  System.out.println("Marte");
                  break;
              case 3:
                  System.out.println("Miercoles");
                  break;
              case 4:
                  System.out.println("Jueves");
                  break;
              case 5:
                  System.out.println("Vieres");
                  break;
              case 6:
                  System.out.println("Sabado");
                  break;
              case 7:
                  System.out.println("Domingo");
                  break;

              default:
                  System.out.println("Error al poner el dia");
                  break;
          }
          if(diaSemana > 1 && diaSemana < 8){
              System.out.println("Error al poner los días");
          }
      }
    }
}