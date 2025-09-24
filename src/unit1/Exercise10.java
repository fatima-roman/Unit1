package unit1;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		// Create variables 
		boolean par; 
		int numero;
		
		//Pedimos los datos 
		System.out.print("\nIntroduce un número: ");
		numero = sc.nextInt();
		
		//Analizamos si es un numero par
		par = numero %2 ==0 ;
		
		
		//Imprimimos los datos
		System.out.println("¿Es par? " + par);
		
		sc.close();
	}

}
