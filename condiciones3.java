/********************************
// Tecnologico de Monterrey
// Campus Santa fe
// Fundamentos de Programacion
// Ejemplos de uso de condiciones 3
// Dr. Luis Yepes Perez
// Jose Carlos Nuñez
// 4/Sep/17
*********************************/

import java.util.Scanner;

public class condiciones3

{
  public static void main(String[] args)
  {
    Scanner lector = new Scanner(System.in);
    int opcion;

    System.out.println("Ingresa un numero y te dire si es primo");
    opcion = lector.nextInt();

    switch(opcion)
    {
      case 2:
      case 3:
      case 5:
      case 7:
        System.out.println("Es un numero primo");
        break;
      case 0:
      case 1:
      case 4:
      case 6:
      case 8:
      case 9:
      case 10:

        System.out.println("No primo");
        break;

      default:
      System.out.println("No es un numero del 1-10");



  }
}
}
