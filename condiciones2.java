/********************************
// Tecnologico de Monterrey
// Campus Santa fe
// Fundamentos de Programacion
// Ejemplos de uso de condiciones 2
// Dr. Luis Yepes Perez
// Jose Carlos Nuñez
// 4/Sep/17
*********************************/

import java.util.Scanner;

public class condiciones2

{
  public static void main(String[] args)
  {
    Scanner lector = new Scanner(System.in);
    int opcion;

    System.out.println("¿En que tarifa quieres viajar? (1-5)");
    opcion = lector.nextInt();

    switch(opcion)
    {
      case 1:
        System.out.println("Tu tarifa es $15274");
        break;
      case 2:
        System.out.println("Tu tarifa es $15459");
        break;
      case 3:
        System.out.println("Tu tarifa es $31337");
        break;
      case 4:
        System.out.println("Tu tarifa es $45233");
        break;
      case 5:
        System.out.println("Tu tarifa es $82916");
        break;
      default:
        System.out.println("Esa opcion no existe.");
    }


  }
}
