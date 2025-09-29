package parte1;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		// Create variables 
		float peras; 
		float manzanas;
		final float precioPeras = 1.95f;
		final float precioManzanas = 2.35f;
		
		//Pedimos los datos 
		System.out.print("¿Cuántos kg de peras has vendido?: ");
		peras = sc.nextFloat();
		System.out.print("\n¿Cuántos kg de manzanas has vendido?: ");
		manzanas = sc.nextFloat();
		
		//Calculamos el valor en euros 
		peras = peras * precioPeras; 
		manzanas = manzanas * precioManzanas; 
		
		
		//Imprimimos los datos
		System.out.println("En total has vendido: " + (peras+manzanas) + "€");
		
		sc.close();

	}

}
