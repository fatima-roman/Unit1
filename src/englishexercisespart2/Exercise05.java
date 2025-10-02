package englishexercisespart2;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		float weight; 
		float height; 
		float BMI; 
		
		//Display prompt for the height
		System.out.print("Enter your height (in meter): ");
		height = sc.nextFloat();
		
		//Display prompt for the weight
		System.out.print("Enter your weight (in kg): ");
		weight = sc.nextFloat();
		
		//Calculate BMI
		BMI= weight / (height * height);
		
		//Print result 
		System.out.println("Your BMI is: " + BMI );
		
		//Close Scanner
		sc.close();
	}

}
