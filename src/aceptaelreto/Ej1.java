package aceptaelreto;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		int siglo; 
		int dato; 
		
		//Ask the user for a number
		System.out.print("Introduce el número del problema: ");
		dato = sc.nextInt();
		
		//calculate what century it is 
		siglo = (dato / 100)+1;
		
		
		//Print result 
		System.out.println("El año " +dato+ " se encuentra en el siglo " + siglo );
		
		//Close Scanner
		sc.close();
	}

}
