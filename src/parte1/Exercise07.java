package parte1;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		// Create variables 
		String nombre; 
		String direccion;
		String telefono; 
		
		//Pedimos los datos 
		System.out.print("Introduce tu nombre: ");
		nombre = sc.nextLine();
		System.out.print("\nIntroduce tu dirección: ");
		direccion = sc.nextLine();
		System.out.print("\nIntroduce tu numero de teléfono: ");
		telefono = sc.nextLine();
		
		
		//Imprimimos los datos
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Teléfono: " + telefono);
		

		
		
		
		sc.close();
	}

}
