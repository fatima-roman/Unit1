package parte2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		int numero; 
		String multiplo;
		int numFalta;
		
		//Ask the user for a number
		System.out.print("Introduce un número entero: ");
		numero = sc.nextInt();
		
		// Calcular si es multiplo de 7 o no 
		multiplo = numero % 7 == 0 ? "Es multiplo de 7" : "No es multiplo de 7 le falta: ";
		numFalta = numero % 7 == 0 ? numero : 7-(numero % 7) ;
		
		//Print result 
		System.out.println((numero%7 ==0 ? multiplo : multiplo + numFalta));
		
		//Close Scanner
		sc.close();

	}

}
