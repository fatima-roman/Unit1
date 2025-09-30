package aceptaelreto;

import java.util.Scanner;

public class Ej1_1 {
	
	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		String colgadas = "colgadas"; 
		String a1; 
		String a2; 
		String a3; 
		int dato; 
		
		//Ask the user for a number
		System.out.print("Introduce el número de intentos (max. 3): ");
		dato = sc.nextInt();

		//calculate which direction it is  
		a1 = dato >=1 ? sc.next().toLowerCase() : "";
		a2 = dato >=2 ? sc.next().toLowerCase() : "";
		a3 = dato >=3 ? sc.next().toLowerCase() : "";
		
		System.out.println(dato>=1 ? (a1.equals(colgadas) ? "Bien" : "Mal"): a1);
		System.out.println(dato>=2 ? (a2.equals(colgadas) ? "Bien" : "Mal"): a2);
		System.out.println(dato>=3 ? (a3.equals(colgadas) ? "Bien" : "Mal"): a3);
		
		//Close Scanner
		sc.close();
	}
}
