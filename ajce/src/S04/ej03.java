package S04;

import java.util.Scanner;

/**
 * 
 * Escribe un programa en que dado un número del 1 a 7 escriba 
 * el correspondiente nombre del día de la semana.
 * 
 * @author Rodolfo Aravena
 * 
 */
public class ej03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
							
		do {
		
						
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
