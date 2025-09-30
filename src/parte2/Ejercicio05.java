package parte2;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		int segundos; 
		int minutos; 
		int horas; 
		int segRestantes; 
		
		//Ask the user for a number
		System.out.print("Introduce un número de segundos: ");
		segundos = sc.nextInt();
		
		// calculate hh:mm:ss  
		horas = segundos / 3600; 
		minutos = (segundos % 3600)/60; 
		segRestantes = segundos % 60; 
		
		//Print result 
		System.out.println(horas + ":" + (minutos > 0 ? minutos : "00")+ ":" + (segRestantes >0 ? segRestantes : "00"));
		
		//Close Scanner
		sc.close();
	}

}
