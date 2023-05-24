import java.util.Scanner;

public class Ex14 {
	
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
			
			System.out.print("Entre o valor de a:");
			double a = scan.nextDouble();
			
			System.out.print("Entre o valor de b:");
			double b = scan.nextDouble();
			
			System.out.print("Entre o valor de c:");
			double c = scan.nextDouble();
			
			double delta = Delta(a, b, c);
			Raizes(delta, a, b, c);			
		

	}
	
	public static void Raizes (double delta, double a, double b, double c) {
		double x1 = (-1 * b + Math.sqrt(delta))/(2*a);
		double x2 = (-1 * b - Math.sqrt(delta))/(2*a);
		
		System.out.print("Resultado: x1: " + x1 + " x2: " + x2);
		
	}
	
	public static double Delta (double a, double b, double c) {
		return (Math.pow(b , 2) - (4 * a * c));
				
	}
	
	

}

