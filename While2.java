
import java.util.Scanner;

public class While2{
	public static void main(String[] args){
		Scanner lectura = new Scanner(System.in);
		int termina;

		System.out.print("Sumatoria \n Hasta que unmero quieres sumar?: ");
		termina = lectura.nextInt();

		System.out.printf("La sumatoria es de %d.", sumatoria(termina));
		System.out.printf("El factorial es de %d.", factorial(termina));


	}
	public static int sumatoria(int num){
		int cont=0, suma=0;

		while(cont<=num){
			suma=suma+cont;
			cont++;
		}
	return suma;
	}

	public static int factorial(int num){
			int cont=1, fact=1;

			do {
				fact*=cont;
				cont++;

			} while (cont<=num);

			
			}
	return fact;
	}
}
