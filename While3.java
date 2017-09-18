
import java.util.Scanner;

public class While3
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		String respuesta;
		double lado;

		respuesta = "si";

		do
		{
			System.out.println("Dame el lado de un cadrado para calcualr su area");
			lado = stdIn.nextDouble();
			stdIn.nextLine();

			System.out.printf("El area es %.2f%n", lado*lado);

			System.out.println("Quieres hacerlo de nuevo?");
			respuesta = stdIn.nextLine();

		}while(respuesta.equalsIgnoreCase("si"));

		System.out.println("Gracias!");


	}
}
