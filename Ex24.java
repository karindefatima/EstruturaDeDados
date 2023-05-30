import java.util.Scanner;
public class Ex24 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int op;
		do{
			System.out.print("TABUADA \n 1- Potência \n 2- Raiz Quadrada \n 3- Fatorial \n 4- Sair \n");
			op = scan.nextInt();
		
			switch ( op ){
			case 1 : 
			    Potencia();
			    break;
			case 2 : 
				Raiz(); 
			    break;
			case 3 : 
				Fatorial();
			    break;
			case 4 : 
				break;
			default : 
				System.out.println("ERROR \n"); 
				break;
			}  
		} while(op != 4);
	}
	
	public static void Potencia(){
		System.out.print("Entre o valor 1:");
		double n1 = scan.nextDouble();
		
		System.out.print("Entre o valor 2:");
		double n2 = scan.nextDouble();
		
		double potencia = Math.pow(n1,n2);
		
		System.out.print("Potência:" +potencia);		
	}
	
	public static void Raiz(){
		System.out.print("Entre o valor:");
		double n = scan.nextDouble();
		
		double raiz = Math.sqrt(n);
		
		System.out.print("\nRaiz:" +raiz);			
	}
	
	public static void Fatorial() {
		System.out.print("Entre o número: ");
		int n1 = scan.nextInt();
		
		int fatorial = n1;
		n1 = n1 - 1;
		while(n1 > 0){
			fatorial *= n1;
			n1--;
		}
        System.out.print("\nFatorial:"+ fatorial);
	}
}
