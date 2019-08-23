package senati.ddw.ciclo3.tareaddw01a;

public class Ejercicio002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=30;
		int num2=15;
		
		System.out.println("El numero 1 es: " + num1);
		System.out.println("El numero 2 es: " + num2);
		System.out.println("----------------------------");
		
		if (num1>=num2)
		{
			if(num1==num2)
			{
				System.out.println("Los numeros "+num1+" y "+num2+" son iguales");
		}
			else
			{
				System.out.println("El número "+num1+" es mayor que el número "+num2);
			}
		}
		else
		{
			System.out.println("El número "+num2+" es mayor que el número "+num1);
		}

	}

}
