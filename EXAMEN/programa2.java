import java.util.Scanner;

public class programa2

{
  public static void main(String[] args)
  {
    Scanner lector = new Scanner(System.in);
    double peso;
		double estatura;


    System.out.println("Introduce tu peso (kg)");
    peso = lector.nextDouble();
		System.out.println("Introduce tu estatura (mts)");
   	estatura = lector.nextDouble();

		double imc = ((peso)/(estatura*estatura));


	if (imc<18.50)
	{
		System.out.println("Estas en bajo peso.");
	}
	else if (imc>18.50 && imc<24.99)
	{
		System.out.println("Estas en el peso normal");
	}
	else if (imc>=25 && imc<=29.99)
{
	System.out.println("Estas en soprepeso");
}
else
{
System.out.println("Tienes obesidad");

}
}
}
/*
C:\Users\A01364718\Programacion\EXAMEN>javac programa2.java

C:\Users\A01364718\Programacion\EXAMEN>java programa2
Introduce tu peso (kg)
80
Introduce tu estatura (mts)
1.83
Estas en el peso normal

C:\Users\A01364718\Programacion\EXAMEN>java programa2
Introduce tu peso (kg)
20
Introduce tu estatura (mts)
190
Estas en bajo peso.

C:\Users\A01364718\Programacion\EXAMEN>java programa2
Introduce tu peso (kg)
100
Introduce tu estatura (mts)
130
Estas en bajo peso.

C:\Users\A01364718\Programacion\EXAMEN>java programa2
Introduce tu peso (kg)
100
Introduce tu estatura (mts)
1.20
Tienes obesidad */
