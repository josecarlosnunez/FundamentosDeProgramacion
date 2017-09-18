/********************************
// Tecnologico de Monterrey
// Campus Santa fe
// Fundamentos de Programacion
// Ejemplos de uso de condiciones 4
// Dr. Luis Yepes Perez
// Jose Carlos Nuñez
// 4/Sep/17
*********************************/

import java.util.Scanner;

public class condiciones4

{
  public static void main(String[] args)
  {
    String zip;
    char codigo;

System.out.println("Escribe tu codigo postal");

    Scanner lector = new Scanner(System.in);
    zip = lector.nextLine();
    codigo = zip.charAt(0);




    switch(codigo)
    {
      case '0':
      case '2':
      case '3':
        System.out.println("Es la zona este");
        break;
      case '4':
      case '5':
      case '6':
        System.out.println("Centro");
        break;
      case '7':
        System.out.println("Sur");
          break;
      case '9':
      case '8':
        System.out.println("Oeste");
          break;
      default:
      System.out.println("No es una zona");



  }
}
}
