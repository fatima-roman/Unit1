package parte1;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
				
		//Creamos las variables
		double numero1; 
		double numero2;

		//Pedimos los datos al usuario 
		System.out.println("Introduce un número: ");
		//Leemos el número introducido 
		numero1 = sc.nextDouble(); 
		
		//Pedimos los datos al usuario 
		System.out.println("Introduce otro número: ");
		//Leemos el número introducido 
		numero2 = sc.nextDouble(); 
				
		//Imprimimos el resultado de los datos introducidos introducido 
		System.out.println("La suma es: " + (numero1+numero2) + "\nLa resta es: " +(numero1-numero2));
		System.out.println("La multiplicación es: " +(numero1*numero2)+"\nLa división es: " +(numero1+numero2));
		
		sc.close();

	}


}
