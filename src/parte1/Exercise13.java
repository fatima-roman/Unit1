package parte1;

import java.util.Scanner;

public class Exercise13 {
	public static void main(String[] args) {
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		// Create variables 
		boolean salir; 
		boolean tarea; 
		boolean biblioteca; 		
		boolean lluvia; 
		String condiciones;
		
		
		//Pedimos los datos 		
		System.out.println(" S = SI 	 N = NO ");
		System.out.print("¿Llueve? ");
		condiciones = sc.next();
		// Pasa el valor a la variable correcta
		lluvia = condiciones.equals("S"); 
		
		
		System.out.print("¿Necesitas ir a la biblioteca? ");
		condiciones = sc.next();
		// Pasa el valor a la variable correcta
		biblioteca = condiciones.equals("S"); 
		
		System.out.print("¿Has terminado la tarea? ");
		condiciones = sc.next();
		// Pasa el valor a la variable correcta
		tarea = condiciones.equals("S"); 
		
		//Calculamos el valor 
		salir = tarea && !lluvia || biblioteca;
		
		
		
		//Imprimimos los datos
		System.out.println("¿Puedes salir? " + (salir ? "Sí" : "N"));
		
		sc.close();
	}


}
