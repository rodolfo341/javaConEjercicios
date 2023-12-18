package S02;
/**
* 
* Realiza un conversor de pesos a dolares. 
* La cantidad en pesetas que se quiere convertir 
* deberá estar almacenada en una variable.
* 
* @author Rodolfo Aravena
* 
*/
import java.util.Scanner;

public class ej05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;

		do {
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
	}

}
