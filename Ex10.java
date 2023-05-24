import java.util.Scanner;

public class Ex10 {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Entre o número:");
		double numb = scan.nextDouble();
		
		 if((numb % 2) == 0) {
		    	System.out.println("O número é par!");
		    }
		    else {
				System.out.printf("O número é impar!");
		    
		    }

		    System.out.println("");

	}

}