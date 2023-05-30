import java.util.Scanner;
public class Ex22 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Entre o número inicial: ");
		int n1 = scan.nextInt();
		
		System.out.print("Entre o número final: ");
		int n2 = scan.nextInt();
		
		int soma = 0;
        for (int i = n1; i <= n2; i++) {
        	soma += i;
        }
        System.out.print("Somatório!"+ soma);
	}
}