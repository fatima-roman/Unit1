package unit1;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
				
		//Creamos las variables
		int añoNacimiento; 
		int añoActual;
				
		//Pedimos los datos al usuario 
		System.out.println("Introduce el año actual: ");
		//Leemos el número introducido 
		añoActual = sc.nextInt(); 
				
		System.out.println("Introduce tu año de nacimiento: ");
		añoNacimiento = sc.nextInt(); 
		
				
		//Imprimimos el resultado de los dato introducidos introducido 
		System.out.println("Tu edad es: " + (añoActual-añoNacimiento));
				
		sc.close();

	}

}
