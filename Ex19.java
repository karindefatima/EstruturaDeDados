import java.util.Scanner;
public class Ex19 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Entre um número de 1 a 9:");
		int num = scan.nextInt();

		Soma(num);
		Subtracao(num);
		Divisao(num);
		Multiplicacao(num);	
	}
	
		public static void Soma(int num) { 
			for (int i = 0; i <= 10; i++) {
				System.out.print(num + " + " + i +" = "+(num+i)+ "\n");
			}
		}
		
		public static void Subtracao(int num) { 
			for (int i = 0; i <= 10; i++) {
				System.out.print(num + " - " + i +" = "+(num-i)+ "\n");
			}
		}
		public static void Divisao(int num) { 
			for (int i = 1; i <= 10; i++) {
				System.out.print(num + " / " + i +" = "+(num/i)+ "\n");
			}
		}
		public static void Multiplicacao(int num) { 
			for (int i = 0; i <= 10; i++) {
				System.out.print(num + " * " + i +" = "+(num*i)+ "\n");
			}
		}		
}
	