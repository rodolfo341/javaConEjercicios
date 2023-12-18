package S02;

import java.util.Scanner;

public class ej06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;

		do {
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
	}

}
