//Construa um programa que identifique se um número é primo
import java.util.Scanner;

public class Ex21 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Entre um número: ");
		int num = scan.nextInt();
		
        for (int i = 2; i <= Math.sqrt(num); i++) {
        	if (num % i == 0) {
        		System.out.print("Não é primo!");
	            break;
	        }
        	
	    }
        System.out.print("É primo!");

	}

}
