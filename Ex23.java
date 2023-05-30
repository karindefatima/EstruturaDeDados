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