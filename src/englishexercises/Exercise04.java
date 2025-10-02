package englishexercises;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		float poundsToKilos; 
		
		//Display prompt for the pounds
		System.out.print("Enter the pounds: ");
		poundsToKilos = sc.nextFloat();
		
		//Converts pounds to kilos
		poundsToKilos = poundsToKilos / 2.2f;			
		
		//Print result 
		System.out.println("The result of the conversion is: " + poundsToKilos + " kilos" );
		
		//Close Scanner
		sc.close();
	}

}
