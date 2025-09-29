package parte2;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		int numero; 
		String multiplo;
		int numFalta;
		int numMultiplo; 
		
		//Ask the user for a number
		System.out.print("Introduce un número para que sea el múltiplo: ");
		numMultiplo = sc.nextInt();
		System.out.print("Introduce un número entero: ");
		numero = sc.nextInt();
		
		// Calcular si es multiplo del número introducido o no 
		multiplo = numero % numMultiplo == 0 ? "Es multiplo de " + numMultiplo : "No es multiplo le falta: ";
		numFalta = numero % numMultiplo == 0 ? numero : numMultiplo-(numero % numMultiplo) ;
		
		//Print result 
		System.out.println((numero%numMultiplo ==0 ? multiplo : multiplo + numFalta));
		
		//Close Scanner
		sc.close();
	}

}
