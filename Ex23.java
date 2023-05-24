/*. Construa um programa que calcule o fatorial de um número. Use uma estrutura de repetição. Fatorial: n! = n (n − 1)!
Exemplo: 5! = 5 x 4 x 3 x 2 x 1 = 120 ou 5! = 1 x 2 x 3 x 4 x 5 = 120
*/
import java.util.Scanner;

public class Ex23 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Entre o número: ");
		int n1 = scan.nextInt();
		
		int fatorial = n1;
		n1 = n1 - 1;
		while(n1 > 0){
			fatorial *= n1;
			n1--;
			
		}
        
        System.out.print("Fatorial:"+ fatorial);

	}

}