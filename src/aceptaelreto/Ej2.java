package aceptaelreto;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		String a; 
		int dato; 
		
		//Ask the user for a number
		System.out.print("Introduce el número de la calle: ");
		dato = sc.nextInt();

		//calculate which direction it is  
		a = (dato%2==0)? "DERECHA":"IZQUIERDA";
		
		//Print result 
		System.out.println("Esta en el lado: " + a);
		
		//Close Scanner
		sc.close();
	}

}
