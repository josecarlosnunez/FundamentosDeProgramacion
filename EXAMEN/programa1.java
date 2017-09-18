import java.util.Scanner;

public class programa1

  {

    public static void main(String[] args)
    {
      int num;
      Scanner stdIn = new Scanner(System.in);


      System.out.println("Escribe el numero que quieras analizar ");

      num = stdIn.nextInt();

      if(num<0)

        {
        System.out.println("Es un numero negativo.");

        }
      else if(num>0)
        {
          System.out.println("Es un numero positivo");
        }
        else
        {
        System.out.println("El numero es cero.");





}

    }

  }

  /*
  C:\Users\A01364718\Programacion\EXAMEN>java programa1
Escribe el numero que quieras analizar
1
Es un numero positivo

C:\Users\A01364718\Programacion\EXAMEN>java programa1
Escribe el numero que quieras analizar
-1
Es un numero negativo.

C:\Users\A01364718\Programacion\EXAMEN>java programa1
Escribe el numero que quieras analizar
0
El numero es cero.
