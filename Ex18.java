import java.util.Scanner;
public class Ex18 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		String pass = "admin12345";
		
		System.out.print("Verificando senha com While:");
		VerifyWhile(pass);
		System.out.print("Verificando senha com Do-While:");
		VerifyDoWhile(pass);
	}
	
	public static void VerifyWhile(String pass){
		
		System.out.print("Entre a senha:");
		String  senha = scan.nextLine();
		
		while (!(senha.equals(pass))) {
			System.out.print("Senha incorreta! Entre a senha novamente: ");
			senha = scan.nextLine();
		}				
	}
	public static void VerifyDoWhile(String pass){
		String  senha;
		
		do{
			System.out.print("Entre a senha:");
			senha = scan.nextLine();
			
		} while (!(senha.equals(pass)));	
	}
}
