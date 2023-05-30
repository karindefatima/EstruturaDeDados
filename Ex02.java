import java.util.Scanner;

public class Ex02 {
	
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Entre sua idade:");
		int idade = scan.nextInt();
		
		System.out.print("Entre sua altura:");
		double altura = scan.nextDouble();
		
		System.out.print("Entre a primeira letra do seu nome:");
		int lnome = scan.next().charAt(0);
		
		scan.nextLine();
		
		System.out.print("Entre seu nome completo:");
		String nome = scan.nextLine();
		
		System.out.printf("Idade: %d \nAltura: %2f \nPrimeira letra do nome: %c \nNome Completo: %s", idade,altura,lnome,nome);
	}
}
