package S03;

import java.util.Scanner;

/**
 *
 * Escribe un programa que calcule el volumen de un cono según la fórmula 
 * V = 3 πr2h
 * 
 * @author Rodolfo Aravena
 * 
 */
public class ej09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
						
		do {
		
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
