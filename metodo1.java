
  /********************************
  // Tecnologico de Monterrey
  // Campus Santa fe
  // Fundamentos de Programacion
  // Ejemplos de uso de metodos
  // Dr. Luis Yepes Perez
  // Jose Carlos Nuñez
  // 28/Ago/17
  *********************************/

import java.util.Scanner;


public class metodo1
  {
    public static void main(String[] args)
    {
      String nombre = "Jose Carlos";


      int edad = 18;

      Scanner lector = new Scanner(System.in);

      System.out.print("Dame tu nombre: ");
      nombre = lector.nextLine();
      System.out.print("Dame tu edad: ");
      edad = lector.nextInt();

      imprime(nombre, edad);


    }

    public static void imprime(String nom, int ed)

     {
       System.out.printf("Hola %s, Tu edad es: %d %n", nom, ed);

     }
  }
