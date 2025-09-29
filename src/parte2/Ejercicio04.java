package parte2;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		int a; 
		int b;
		int c; 
		
		//Ask the user for a number
		System.out.print("Introduce un número para a: ");
		a = sc.nextInt();
		System.out.print("Introduce un número para b: ");
		b = sc.nextInt();
		System.out.print("Introduce un número para c: ");
		c = sc.nextInt();

		
		//Print result 
		System.out.println("y="+a+"x^2"+b+"x"+c);
		
		//Close Scanner
		sc.close();
		
		//y=ax2+bx+c

	}

}
