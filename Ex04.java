//Calcular e exibir a média aritmética de três números inteiros
import java.util.Scanner;

public class Ex04 {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Entre o primeiro número:");
		int n1 = scan.nextInt();
		
		System.out.print("Entre o segundo número:");
		int n2 = scan.nextInt();
		
		System.out.print("Entre o terceiro número:");
		int n3 = scan.nextInt();
		
		int result = (n1 + n2 + n3)/3;
		System.out.printf("Média: %d\n", result);
		
		

	}

}
