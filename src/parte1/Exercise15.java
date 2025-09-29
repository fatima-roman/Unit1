package parte1;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		// Create variables 
		int IVA = 21; 
		float precio;
		float precioConIVA;
		
		//Pedimos los datos 
		System.out.print("\nIntroduce el precio: ");
		precio = sc.nextFloat();
		
		//Calcular el IVA
		precioConIVA = precio * (1+IVA/100.0f);
		
		//Imprimimos los datos
		System.out.println("Precio con IVA: " + precioConIVA);		
		
		
		sc.close();
		}

}
