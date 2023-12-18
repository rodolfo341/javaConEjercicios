package S02;
/**
* 
* Escribe un programa que declare 5 variables de tipo char. 
* A continuación, crea otra variable como cadena de caracteres y 
* asígnale como valor la concatenación de las anteriores 5 variables. 
* Por último, muestra la cadena de caracteres por pantalla 
* ¿Qué problemas te encuentras? 
* ¿cómo lo has solucionado?
* 
* @author Rodolfo Aravena
* 
*/
import java.util.Scanner;

public class ej08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;

		do {
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');

	}

}
