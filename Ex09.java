import java.util.Scanner;

public class Ex09 {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		double pi = 3.14;
		double raio = 0;
		
		
		do 
	    {
			System.out.print("Entre o raio do círculo:");
			raio = scan.nextDouble();
	    } 
	    while( raio <= 0 );
		
		double area = (pi * (raio * raio));
		System.out.printf("Área do círculo: %2f\n", area);
		

	}

}