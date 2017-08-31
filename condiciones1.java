/********************************
// Tecnologico de Monterrey
// Campus Santa fe
// Fundamentos de Programacion
// Ejemplos de uso de condiciones
// Dr. Luis Yepes Perez
// Jose Carlos Nuñez
// 31/Ago/17
*********************************/

import java.util.Scanner;

public class condiciones1

  {

    public static void main(String[] args)
    {
      int temperatura;
      Scanner stdIn = new Scanner(System.in);
      String salida;

      System.out.println("Escribe la temperatura del auto ");

      temperatura = stdIn.nextInt();

      if(temperatura<-10)
      // or se escibe ||
      // and se escribe &&
      // diferente se escribe !=
        {
        System.out.println("Temperatura es muy fria, porfavor detente.");
        System.out.println("Revisa el nivel de aceite");
        }
      else if(temperatura<=110)
        {
          System.out.println("Todo bien al cien.");
        }
        else
        {
        System.out.println("Temperatura es muy caliente, porfavor detente.");
        System.out.println("Revisa el nivel de aceite");
        }


        stdIn.nextLine();
        System.out.println("Escribe s para salir");
        salida=stdIn.nextLine();
        if(salida.equalsIgnoreCase("s"))

      {
        System.out.println("Adios!");

      }

    }

  }
