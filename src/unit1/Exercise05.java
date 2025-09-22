package unit1;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
				
		//Creamos las variables
		double longitud; 
		double radio;
		double area;
		double pi = Math.PI;
				
		//Pedimos los datos al usuario 
		System.out.println("Introduce el radio de la circunferencia: ");
		//Leemos el número introducido 
		radio = sc.nextDouble(); 
		
		//Calculo de longitud
		longitud = 2*pi*radio;
		
		//Calculo de radio
		area = pi*(radio*radio);
		
				
		//Imprimimos el resultado de los dato introducidos introducido 
		System.out.println("La logitud es: "+longitud + "\nEl área es: "+area);
				
		sc.close();

	}

}
