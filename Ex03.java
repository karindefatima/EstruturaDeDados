/*Receba do teclado dois números inteiros, calcule e exiba os resultados das seguintes
 *  operações: adição, subtração, multiplicação, quociente da
 *  divisão e o resto da divisão */

import java.util.Scanner;
public class Ex03 {

	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.print("Entre o primeiro número:");
		int n1 = scan.nextInt();
		
		System.out.print("Entre o segundo número:");
		int n2 = scan.nextInt();
		
		int result = n1 + n2;
		System.out.printf("Soma: %d\n", result);
		
		result = n1 - n2;
		System.out.printf("Subtração: %d\n", result);
		
		result = n1*n2;
		System.out.printf("Multiplicação: %d\n", result);
		
		result = n1/n2;
		System.out.printf("Divisão: %d\n", result);
		
		result = n1%n2;
		System.out.printf("Resto: %d\n", result);
	}

}
