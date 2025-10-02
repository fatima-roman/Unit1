package englishexercises;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		int teamSize; 
		int students; 
		int studentsLeft; 
		int numberTeams; 
		
		//Display prompt for the team size 
		System.out.print("Enter the team size: ");
		teamSize = sc.nextInt();
		
		//Display prompt for the number of students 
		System.out.print("Enter the number of stundents: ");
		students = sc.nextInt();
		
		//Calculate students left 
		studentsLeft = students % teamSize;
		
		//Calculate the number of teams  
		numberTeams = students / teamSize;
		
		//Print result 
		System.out.println("Students left: " + studentsLeft );
		System.out.println("Number of teams: " + numberTeams );
		
		//Close Scanner
		sc.close();
	}

}
