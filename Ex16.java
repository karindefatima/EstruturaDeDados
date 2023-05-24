/*Construa um programa que leia do usuário um número inicial e um número final. Em seguida, exiba na tela uma sequencia com os números desse
intervalo informado pelo usuário. Exemplo: caso o usuário entre com os números 4 e 10, o resultado do programa seria: 4 5 6 7 8 9 10
a) Construa este programa utilizando a estrutura while.
b) Construa este programa utilizando a estrutura do-while.
c) Construa este programa utilizando a estrutura for.*/
import java.util.Scanner;

public class Ex16 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Entre o valor inicial:");
		int  n1= scan.nextInt();
		
		System.out.print("Entre o valor final:");
		int  n2= scan.nextInt();
		
		System.out.print("Sequência com While: ");
		InterWhile(n1, n2);
		System.out.print("Sequência com DoWhile: ");
		InterDoWhile(n1, n2);
		System.out.print("Sequência com For: ");
		InterFor(n1, n2);
		
	}
	
	public static void InterWhile(int n1, int n2){
		int cont = n1;
		while (cont <= n2) {
			System.out.print(cont + " ");
			cont++;
		}
		
	}
	public static void InterDoWhile(int n1, int n2){
		int cont = n1;
		do {
			System.out.print(cont +" ");
			cont++;
		} while (cont <= n2);
		
	}
	public static void InterFor(int n1, int n2){
		for (int i = n1; i <= n2; i++) {
			System.out.print(i + " ");
		}
		
	}

}
