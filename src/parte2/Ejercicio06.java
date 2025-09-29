package parte2;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		double mm; 
		double cm; 
		double m; 
		
		//Ask the user for a number
		System.out.print("Introduce un número de mm: ");
		mm = sc.nextDouble();
		System.out.print("Introduce un número de cm: ");
		cm = sc.nextDouble();
		System.out.print("Introduce un número de metros: ");
		m = sc.nextDouble();
		
		// Calcular si es multiplo del número introducido o no 
		mm = mm / 10.0; 
		m = m * 100.0;
		
		//Print result 
		System.out.println("En cm: " + (mm+cm+m));
		
		//Close Scanner
		sc.close();
	}

}
