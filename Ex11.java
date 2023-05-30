import java.util.Scanner;
public class Ex11 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		double conta1 = 100.00;
		double conta2 = 100.00;
		
		System.out.print("Entre o valor da transferência:");
		double transfer = scan.nextDouble();
		
		 if((conta1 - transfer) == 0) {
		    	System.out.println("O saldo é insuficiente!");
		    }
		    else {
		    	conta1 = (conta1 - transfer);
		    	conta2 = (conta2 + transfer);
				System.out.printf("Transferência realizada! \nConta 1 : %2f \nConta 2 : %2f ", conta1, conta2);
		    }
		    System.out.println("");
	}
}