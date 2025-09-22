package unit1;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
				
		//Creamos las variables
		int nota1; 
		int nota2;
				
		//Pedimos los datos al usuario 
		System.out.println("Introduce una nota: ");
		//Leemos el número introducido 
		nota2 = sc.nextInt(); 
				
		System.out.println("Introduce otra nota: ");
		nota1 = sc.nextInt(); 
		
				
		//Imprimimos el resultado de los dato introducidos introducido 
		System.out.println("Tu edad es: " + ((nota2+nota1)/2));
				
		sc.close();

	}
}
