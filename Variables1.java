public class Variables1
{
	public static void main (String[] args)
	{
		//Declarar variables

		int numero1;
		double numero2, numero3=0;

		double pi = 3.14;

		final double velocidadDeLaLuz = 299792458.0;

		pi = 3.1415926535897932384626;

		numero1 = (int)pi;

		numero2 = (numero1+numero3) / 2;
		numero2 += numero1;




		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(Math.sqrt(++numero2));
		System.out.println(numero2);

	}
}