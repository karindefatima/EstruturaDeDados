import java.util.Scanner;
public class Ex08 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Entre o seu peso:");
		double peso = scan.nextDouble();
		
		System.out.print("Entre sua altura:");
		double altura = scan.nextDouble();
		
		 if(altura == 0) {
		    	System.out.println("Não é posssível realizar divisão por 0!");
		    }
		    else {
		    	double imc = (peso / (altura * altura));
				System.out.printf("IMC: %2f\n", imc);
		    }
		    System.out.println("");
	}
}