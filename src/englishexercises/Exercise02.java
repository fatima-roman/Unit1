package englishexercises;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		int userAge; 
		int yearBorn; 
		final int CURRENT_YEAR = 2025; 
		
		//Display prompt for question user's age 
		System.out.print("Enter your age: ");
		userAge = sc.nextInt();
		
		//Calculate the user's year of birth 
		yearBorn =  CURRENT_YEAR - userAge;		
		
		//Print result 
		System.out.println("You were born in the yaer: " + yearBorn );
		
		//Close Scanner
		sc.close();
	}

}
