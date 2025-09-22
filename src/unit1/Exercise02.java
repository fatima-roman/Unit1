package unit1;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
				
		//Creamos las variables
		int edad; 
				
		//Pedimos el número al usuario 
		System.out.println("Introduce tu edad: ");
				
		//Leemos el número introducido 
		edad = sc.nextInt(); 
				
		//Imprimimos el numero introducido 
		System.out.println("Tu edad el próximo año será: " + (edad+1));
				
		sc.close();

	}

}
