package S02;
/**
* 
* Crea la variable nombre y asígnale tu nombre completo. 
* Muestra su valor por pantalla 
* 
* @author Rodolfo Aravena
* 
*/
import java.util.Scanner;

public class ej02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;

		do {
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');

	}

}
