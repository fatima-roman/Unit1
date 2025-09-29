package parte2;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		double numero; 
		
		//Ask the user for a number
		System.out.print("Introduce un número con decimales: ");
		numero = sc.nextDouble();
		numero = numero + 0.5f;
		
		//Print result 
		System.out.println("El número sin decimales es: " + (int) numero);
		
		//Close Scanner
		sc.close();

	}

}
