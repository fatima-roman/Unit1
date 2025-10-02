package englishexercises;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		float length; 
		float height; 
		float area; 
		float perimeter; 
		
		//Display prompt for the length
		System.out.print("Enter the length: ");
		length = sc.nextFloat();
		
		//Display prompt for the height
		System.out.print("Enter the height: ");
		height = sc.nextFloat();
		
		
		//Calculate the area = l * h
		area = length * height;		
		
		//Calculate the perimeter = 2l + 2h
		perimeter = (2*length) + (2*height);		
		
		//Print result 
		System.out.println("The perimeter  is: " + perimeter );
		System.out.println("The area  is: " + area );
		
		//Close Scanner
		sc.close();
	}

}
