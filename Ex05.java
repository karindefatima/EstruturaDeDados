import java.util.Scanner;
public class Ex05 {

	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Entre o primeiro número:");
		double n1 = scan.nextDouble();
		
		System.out.print("Entre o segundo número:");
		double n2 = scan.nextDouble();
		
		System.out.print("Entre o terceiro número:");
		double n3 = scan.nextDouble();
		
		double result = (n1 + n2 + n3)/3;
		System.out.printf("Média: %2f\n", result);
	}
}