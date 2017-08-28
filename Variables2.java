public class Variables2
{
	public static void main (String[] args)
	{
		char inicialNombre, inicialApellido, codigoControl;

		inicialNombre = 'J';
		inicialApellido = 'N';

		codigoControl = '\n';
		String texto= "Mi nombre es ";



		System.out.println("Hola "+inicialNombre);
		System.out.println("Codigo: "+codigoControl);
		System.out.println("\"Hola de \t nuevo \r "+inicialApellido);
		System.out.println("\\");

		System.out.println("Los caracteres de texto son "+texto.lenght());
		System.out.println("El caracter en 5 es "+texto.charAt(5));





	}
}