package unit1;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		// Create variables 
		float notaExpediente; 
		int primerTrimestre;
		int segundoTrimestre;
		int tercerTrimestre;

		
		//Pedimos los datos 
		System.out.print("¿De cuanto fue tu media del primer trimestre?: ");
		primerTrimestre = sc.nextInt();
		
		System.out.print("¿De cuanto fue tu media del segundo trimestre?: ");
		segundoTrimestre = sc.nextInt();
		
		System.out.print("¿De cuanto fue tu media del tercer trimestre?: ");
		tercerTrimestre = sc.nextInt();
		
		
		notaExpediente = ((primerTrimestre+segundoTrimestre+tercerTrimestre)/3.0f);

		
		//Imprimimos los datos
		System.out.println("Nota primer trimestre: " + primerTrimestre);
		System.out.println("Nota segundo trimestre: " + segundoTrimestre);
		System.out.println("Nota tercer trimestre: " + tercerTrimestre);
		System.out.println("Nota media: " + ((primerTrimestre+segundoTrimestre+tercerTrimestre)/3));
		System.out.println("Nota media expediente: " + notaExpediente);
		
		sc.close();

	}

}
