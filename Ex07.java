/*Calcular uma divisão entre dois números reais. 
 * Produza um alerta em caso de divisão por zero
 */
import java.util.Scanner;

public class Ex07 {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Entre o primeiro número:");
		double n1 = scan.nextDouble();
		
		System.out.print("Entre o segundo número:");
		double n2 = scan.nextDouble();
		
		 if(n2 == 0) {
		    	System.out.println("Não é posssível realizar divisão por 0!");
		    }
		    else {
		    	double result = (n1/n2);
				System.out.printf("Divisão: %2f\n", result);
		    
		    }

		    System.out.println("");
		
		
		

	}

}