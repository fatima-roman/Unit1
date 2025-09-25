package unit1;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		// Create variables 
		float pesetas;
		float euros;
		
		//Pedimos los datos 
		System.out.print("\nIntroduce un valor en pesetas: ");
		pesetas = sc.nextInt();
		
		//Calculamos el valor en euros 
		euros = pesetas / 166; 
		
		
		//Imprimimos los datos
		System.out.println("En euros son: " + euros + "€");
		
		sc.close();
	}

}
