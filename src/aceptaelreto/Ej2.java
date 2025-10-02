package aceptaelreto;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		int dato; 
		
		//Ask the user for a number to start the loop 
		System.out.print("Introduce el número de la calle (0 para salir): ");
		dato = sc.nextInt();
		
		while (dato != 0){
			//calculate which direction it is  and print it 
			System.out.println((dato%2==0)? "Esta en la DERECHA":"Esta en la IZQUIERDA");
			
			//Ask the user for a number
			System.out.print("Introduce el número de la calle (0 para salir): ");
			dato = sc.nextInt();
		}
		
		//Close Scanner
		sc.close();
	}

}
