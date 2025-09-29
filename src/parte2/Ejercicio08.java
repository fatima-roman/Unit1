package parte2;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		double metros; 
		double cm; 
		
		//Ask the user for a number
		System.out.print("Introduce un número de metros del lanzamiento: ");
		metros = sc.nextDouble();
		
		// Calcular si es multiplo del número introducido o no 
		cm = metros * 100.0; 
		
		//Print result 
		System.out.println("El resultado es: " + (int)cm + "cm" );
		
		//Close Scanner
		sc.close();
	}

}
