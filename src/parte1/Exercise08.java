package parte1;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		// Create variables 
		String nombre; 
		int edad;
		
		//Pedimos los datos 
		System.out.print("Introduce tu nombre: ");
		nombre = sc.nextLine();
		System.out.print("\nIntroduce tu edad: ");
		edad = sc.nextInt();
		
		
		//Imprimimos los datos
		System.out.println("Hola " + nombre+", tienes "+ edad+ " años, ¡qué mayor eres!");
		
		sc.close();


	}

}
