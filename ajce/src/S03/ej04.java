package S03;

import java.util.Scanner;

/**
 *
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 * @author Rodolfo Aravena
 * 
 */
public class ej04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
						
		do {
		
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
