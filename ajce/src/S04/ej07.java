package S04;

import java.util.Scanner;

/**
 * 
 * Realiza un programa que calcule la media de tres notas
 * 
 * @author Rodolfo Aravena
 * 
 */
public class ej07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
							
		do {
		
						
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
