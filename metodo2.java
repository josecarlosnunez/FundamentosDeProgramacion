import java.util.Scanner;

public class metodo2
    {
      public static void main(String[] args)
      {
        System.out.printf("El cuadrado de %f es %f", 4.0, cuadrado(4.0));
        imprimeHola();

      }
      public static double cuadrado (double numero)
      {
        double cuadrado;
        cuadrado = numero*numero;
        return cuadrado;
      }

        public static void imprimeHola()

      {
        System.out.printf("Hola a todos");
      }

    }
