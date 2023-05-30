import java.util.Scanner;
public class Ex15 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Entre um número no intervalo de 1 a 5:");
		int num = scan.nextInt();
		
		if ((num > 0) && (num < 6)) {
			
			switch ( num ){
			       case 1 : System.out.println("um"); break;
			       case 2 : System.out.println("dois"); break;
			       case 3 : System.out.println("três"); break;
			       case 4 : System.out.println("quatro"); break;
			       case 5 : System.out.println("cinco"); break;
				   default : System.out.println("ERROR \n"); break;
			    }  
			
		} else {
			System.out.print("Número Inválido!");
		}
	}
}
