package unit1;

import java.util.Scanner;

public class Exercise13 {
	public static void main(String[] args) {
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		// Create variables 
		boolean salir; 
		int tarea; 
		int biblioteca; 		
		int lluvia; 		
		
		
		//Pedimos los datos 		
		System.out.print("1 = SI \n 0 = NO ");
		System.out.print("¿Llueve? ");
		lluvia = sc.nextInt();
		System.out.print("¿Necesitas ir a la biblioteca? ");
		biblioteca = sc.nextInt();
		System.out.print("¿Has terminado la tarea? ");
		tarea = sc.nextInt();
		
		//Calculamos el valor en euros 
		
		
		
		//Imprimimos los datos
		System.out.println();
		
		sc.close();
	}


}
