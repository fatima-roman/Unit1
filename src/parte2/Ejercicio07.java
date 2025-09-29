package parte2;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		double infantil; 
		double adulto; 
		final double INFANTIL_PRECIO = 15.50; 
		final double ADULTO_PRECIO = 20.00; 
		final double DESCUENTO = 0.05; 
		double precio; 
		
		//Ask the user for a number
		System.out.print("Introduce el número de entradas infantil: ");
		infantil = sc.nextDouble();
		System.out.print("Introduce el número de entradas adulto: ");
		adulto = sc.nextDouble();
		
		// Calcular el precio de las entradas  
		infantil = infantil * INFANTIL_PRECIO;
		adulto = adulto * ADULTO_PRECIO;
		precio = adulto + infantil; 
		
		// y el precio con descuento 
		precio = precio > 100.0 ? precio-(precio*DESCUENTO): precio; 
		
		
		//Print result 
		System.out.println("El precio total es: " + precio );
		
		//Close Scanner
		sc.close();
	}

}
