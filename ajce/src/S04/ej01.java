package S04;

import java.util.Scanner;

/**
 * 
 * Escribe un programa que pida por teclado un día de la semana y 
 * que diga qué asignatura toca a primera hora ese día.
 * 
 * @author Rodolfo Aravena
 * 
 */
public class ej01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
							
		do {
		
						
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();
	}

}
