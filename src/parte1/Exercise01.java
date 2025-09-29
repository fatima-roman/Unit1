package parte1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos las variables
		int numero; 
		
		//Pedimos el número al usuario 
		System.out.println("Introduce un número: ");
		
		//Leemos el número introducido 
		numero = sc.nextInt(); 
		
		//Imprimimos el numero introducido 
		System.out.println("El número introducido es: " + numero);
		
		sc.close();

	}

}
