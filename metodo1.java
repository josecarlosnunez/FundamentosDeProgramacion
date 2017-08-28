
  /********************************
  // Tecnologico de Monterrey
  // Campus Santa fe
  // Fundamentos de Programacion
  // Ejemplos de uso de metodos
  // Dr. Luis Yepes Perez
  // Jose Carlos Nuñez
  // 28/Ago/17
  *********************************/





public class metodo1
  {
    public static void main(String[] args)
    {
      String nombre = "Jose Carlos";
      String otroNombre = "Miguel";

      imprime(nombre);
      System.out.println("Entre llamada del metodo.");
      imprime(otroNombre);

    }

    public static void imprime(String nom)

     {
       System.out.printf("Hola %s desde el metodo. %n", nom);


     }
  }
