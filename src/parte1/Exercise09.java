package parte1;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		// Create variables 
		boolean mayorDeEdad; 
		int edad;
		
		//Pedimos los datos 
		System.out.print("\nIntroduce tu edad: ");
		edad = sc.nextInt();
		
		//Analizamos si es mayor de edad
		mayorDeEdad = edad >= 18;
		
		
		//Imprimimos los datos
		System.out.println("Mayor de edad: " + mayorDeEdad);
		
		sc.close();


	}

}
