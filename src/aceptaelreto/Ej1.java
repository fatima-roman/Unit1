package aceptaelreto;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		String colgadas = "colgadas"; 
		String a; 
		int dato; 
		
		//Ask the user for a number
		System.out.print("Introduce el número de intentos: ");
		dato = sc.nextInt();

		//calculate which direction it is  
		for (int i = 0 ; i <dato; i++) {
			System.out.print("Introduce el nombre: ");
			a = sc.next();
			a = a.toLowerCase();
			a = a.equals(colgadas) ? "Bien" : "Mal";
			//Print result 
			System.out.println(a);
		}
		
		
		//Close Scanner
		sc.close();
	}

}
